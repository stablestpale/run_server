package top.su_root.run_server.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import top.su_root.run_server.entity.Admin;
import top.su_root.run_server.entity.UserAccount;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author zzy
 * @description:
 * @date 2022/6/5 11:06
 */


public class TokenUtil {
    private static final String JWT_ID = UUID.randomUUID().toString();

    private static final String JWT_SECRET = "Keeper";

    private static final long JWT_TTL = 24 * 60 * 60 * 1000;


    private static SecretKey generalKey() {
        // 解码
        byte[] encodedKey = JWT_SECRET.getBytes();

        // 根据给定的字节数组使用AES加密算法构造密钥
        return new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
    }


    public static String createAdminJwt(Admin admin) throws Exception {
        String subject = new ObjectMapper().writeValueAsString(admin);
        return createJwt(subject, JWT_TTL);
    }


    public static Map<String, String> createUserJwt(UserAccount user) throws Exception {
        String subject = new ObjectMapper().writeValueAsString(user);
        Map<String, String> tokens = new HashMap<>();
        String refreshToken = createJwt(subject, 90 * JWT_TTL);
        tokens.put("refresh-token", refreshToken);
        String accessToken = getNewToken(refreshToken);
        tokens.put("access-token", accessToken);
        return tokens;
    }


    public static String getNewToken(String refreshToken) {
        String subject = parseJwt(refreshToken).getSubject();
        return createJwt(subject, JWT_TTL);
    }


    private static String createJwt(String subject, long ttl) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        // 生成JWT的时间
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        // 创建payload的私有声明
        Map<String, Object> claims = new HashMap<>();
        claims.put("author", "Keeper");

        // 生成秘钥
        SecretKey key = generalKey();

        JwtBuilder builder = Jwts.builder()
                .setClaims(claims)
                .setId(JWT_ID)              // JWT唯一标识
                .setIssuedAt(now)           // 签发时间
                .setIssuer("Keeper")        // jwt签发人
                .setSubject(subject)        // 用户标志
                .signWith(signatureAlgorithm, key); // 设置秘钥

        // 设置过期时间
        long expMillis = nowMillis + ttl;
        Date exp = new Date(expMillis);
        builder.setExpiration(exp);

        return builder.compact();
    }


    public static Claims parseJwt(String jwt) {
        SecretKey key = generalKey();  //签名秘钥，和生成的签名的秘钥一模一样
        return Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(jwt).getBody();
    }
}
