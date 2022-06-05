package top.su_root.run_server.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.su_root.run_server.entity.UserAccount;
import top.su_root.run_server.service.UserAccountService;
import top.su_root.run_server.utils.PermissionHelper;
import top.su_root.run_server.utils.TokenUtil;
import top.su_root.run_server.utils.api.BaseResult;

import java.util.Map;

import static top.su_root.run_server.utils.ConstUtil.*;

/**
 * @author zzy
 * @description:
 * @date 2022/5/30 15:09
 */

@Api(tags = USER_ACCOUNT)
@CrossOrigin
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserAccountController {
    private final UserAccountService userAccountService;

    /*
     * @description: 注册
     * @param: [user]
     * @return: BaseResult<String>
     */
    @PostMapping(REGISTER)
    @ApiOperation(API_REGISTER)
    public BaseResult<String> register(@RequestBody UserAccount user) {
        userAccountService.insertAccount(user);
        return BaseResult.success(QUERY_SUCCESS);
    }


    /*
     * @description: 用户登录
     * @param: [account, psd]
     * @return: BaseResult
     */
    @GetMapping(LOGIN)
    @ApiOperation(API_LOGIN)
    public BaseResult login(@RequestHeader String account, @RequestHeader String psd) throws Exception {
        BaseResult baseResult;
        UserAccount userAccount = new UserAccount(account, psd);
        if (userAccountService.login(userAccount)) {
            Map<String, String> tokens  = TokenUtil.createUserJwt(userAccount);
            baseResult = BaseResult.success(tokens, LOGIN_SUCCESS);
        } else {
            baseResult = BaseResult.failed(LOGIN_FAIL);
        }
        return baseResult;
    }


    /*
     * @description: TOKEN登录
     * @param: []
     * @return: BaseResult
     */
    @GetMapping(LOGIN_VIA_TOKEN)
    @ApiOperation(API_LOGIN_VIA_TOKEN)
    @ApiImplicitParam(name = "token", value = "token", required = true, paramType = "header", dataTypeClass = String.class)
    @PermissionHelper(PermissionHelper.USER)
    public BaseResult login() {
        return BaseResult.success(LOGIN_SUCCESS);
    }


    /*
     * @description: 更新token
     * @param: [token]
     * @return: BaseResult
     */
    @GetMapping(REFRESH_TOKEN)
    @ApiOperation(API_REFRESH_TOKEN)
    @ApiImplicitParam(name = "token", value = "token", required = true, paramType = "header", dataTypeClass = String.class)
    @PermissionHelper(PermissionHelper.USER)
    public BaseResult freshToken(@RequestHeader String token) {
        String newToken = TokenUtil.getNewToken(token);
        return BaseResult.success(newToken);
    }
}
