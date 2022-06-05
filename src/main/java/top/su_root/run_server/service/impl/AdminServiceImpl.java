package top.su_root.run_server.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.su_root.run_server.dao.AdminMapper;
import top.su_root.run_server.dao.UserInfoMapper;
import top.su_root.run_server.entity.Admin;
import top.su_root.run_server.entity.AdminExample;
import top.su_root.run_server.entity.UserInfo;
import top.su_root.run_server.entity.UserInfoExample;
import top.su_root.run_server.service.AdminService;

import java.util.List;

/**
 * @author zzy
 * @description:
 * @date 2022/6/2 11:05
 */


@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdminServiceImpl implements AdminService {
    private final AdminMapper adminMapper;
    private final UserInfoMapper userInfoMapper;

    /*
     * @description: admin登录
     * @param: [admin]
     * @return: boolean
     */
    @Override
    public boolean login(Admin admin) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andNameEqualTo(admin.getName());
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        return admins.size() == 1 && admins.get(0).getPassword().equals(admin.getPassword());
    }


    /*
     * @description: 获取用户记录
     * @param: []
     * @return: List<UserInfo>
     */
    @Override
    public List<UserInfo> queryUserInfo() {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria();
        return userInfoMapper.selectByExample(userInfoExample);
    }
}
