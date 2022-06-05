package top.su_root.run_server.controller;

import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import top.su_root.run_server.entity.Admin;
import top.su_root.run_server.service.AdminService;
import top.su_root.run_server.service.RunRecordService;
import top.su_root.run_server.utils.TokenUtil;
import top.su_root.run_server.utils.api.BaseResult;

import static top.su_root.run_server.utils.ConstUtil.*;

/**
 * @author zzy
 * @description:
 * @date 2022/6/5 10:54
 */

@Api(tags = ADMIN)
@CrossOrigin
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdminController {
    private final AdminService adminService;
    private final RunRecordService runRecordService;


    @ApiOperation(API_ADMIN_LOGIN)
    @GetMapping(ADMIN_LOGIN)
    public BaseResult<String> adminLogin(@RequestHeader String account, @RequestHeader String psd) throws Exception {
        BaseResult baseResult;
        Admin admin = new Admin(account, psd);
        if (adminService.login(admin)) {
            String token = TokenUtil.createAdminJwt(admin);
            baseResult = BaseResult.success(token, LOGIN_SUCCESS);
        } else {
            baseResult = BaseResult.failed(LOGIN_FAIL);
        }
        return baseResult;
    }
}
