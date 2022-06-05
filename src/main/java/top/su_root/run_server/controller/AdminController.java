package top.su_root.run_server.controller;

import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import top.su_root.run_server.entity.Admin;
import top.su_root.run_server.entity.RunRecord;
import top.su_root.run_server.entity.UserInfo;
import top.su_root.run_server.service.AdminService;
import top.su_root.run_server.service.RunRecordService;
import top.su_root.run_server.utils.PermissionHelper;
import top.su_root.run_server.utils.TokenUtil;
import top.su_root.run_server.utils.api.BaseResult;

import java.util.List;

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


    /*
     * @description: 管理员登录
     * @param: [account, psd]
     * @return: BaseResult<String>
     */
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


    /*
     * @description: 获取用户信息
     * @param: []
     * @return: BaseResult<List<UserInfo>>
     */
    @GetMapping(GET_USERS)
    @ApiOperation(API_GET_USERS)
    @ApiImplicitParam(name = "token", value = "token", required = true, paramType = "header", dataTypeClass = String.class)
    @PermissionHelper(PermissionHelper.ADMIN)
    public BaseResult<List<UserInfo>> getUsers() {
        List<UserInfo> userInfos = adminService.queryUserInfo();
        return BaseResult.success(userInfos, QUERY_SUCCESS);
    }


    /*
     * @description: 获取用户的跑步数据
     * @param: [account]
     * @return: BaseResult<List<RunRecord>>
     */
    @GetMapping(GET_USER_RCD)
    @ApiOperation(API_GET_USER_RCD)
    @ApiImplicitParam(name = "token", value = "token", required = true, paramType = "header", dataTypeClass = String.class)
    @PermissionHelper(PermissionHelper.ADMIN)
    public BaseResult<List<RunRecord>> getUserRcd(@RequestHeader String account) {
        List<RunRecord> runRecords = runRecordService.queryRunRecordListByAccount(account);
        return BaseResult.success(runRecords, QUERY_SUCCESS);
    }
}
