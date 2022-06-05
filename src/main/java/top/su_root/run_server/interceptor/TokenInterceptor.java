package top.su_root.run_server.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import top.su_root.run_server.entity.Admin;
import top.su_root.run_server.entity.UserAccount;
import top.su_root.run_server.service.AdminService;
import top.su_root.run_server.service.UserAccountService;
import top.su_root.run_server.utils.PermissionHelper;
import top.su_root.run_server.utils.TokenUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author zzy
 * @description:
 * @date 2022/5/30 15:07
 */

@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Resource
    private AdminService adminService;

    @Resource
    private UserAccountService userAccountService;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            PermissionHelper permission = ((HandlerMethod) handler).getMethod().getAnnotation(PermissionHelper.class);
            if (permission != null) {
                String token = request.getHeader("token");
                Claims claims = TokenUtil.parseJwt(token);
                response.setCharacterEncoding("UTF-8");
                response.setContentType("application/json; charset=utf-8");
                switch (permission.value()) {
                    case PermissionHelper.ADMIN: {
                        Admin admin = new ObjectMapper().readValue(claims.getSubject(), Admin.class);
                        if (!adminService.login(admin)) {
                            response.sendError(HttpStatus.UNAUTHORIZED.value());
                            return false;
                        }
                        break;
                    }
                    case PermissionHelper.USER: {
                        UserAccount user = new ObjectMapper().readValue(claims.getSubject(), UserAccount.class);
                        if (!userAccountService.login(user)) {
                            response.sendError(HttpStatus.UNAUTHORIZED.value());
                            return false;
                        }
                        break;
                    }
                }
                long nowMillis = System.currentTimeMillis();
                if (nowMillis > claims.getExpiration().getTime()) {
                    PrintWriter writer = response.getWriter();
                    writer.write(new ObjectMapper().writeValueAsString(handler));
                    writer.flush();
                    writer.close();
                    return false;
                }
            }
        }
        return true;
    }
}
