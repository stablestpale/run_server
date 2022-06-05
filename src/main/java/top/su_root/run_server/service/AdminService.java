package top.su_root.run_server.service;

import top.su_root.run_server.entity.Admin;
import top.su_root.run_server.entity.UserInfo;

import java.util.List;

/**
 * @author zzy
 * @description:
 * @date 2022/6/2 11:05
 */


public interface AdminService {

    boolean login(Admin admin);

    List<UserInfo> queryUserInfo();
}
