package top.su_root.run_server.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.su_root.run_server.dao.UserAccountMapper;
import top.su_root.run_server.entity.UserAccount;
import top.su_root.run_server.entity.UserAccountExample;
import top.su_root.run_server.service.UserAccountService;

import java.util.List;

/**
 * @author zzy
 * @description:
 * @date 2022/5/30 15:13
 */


@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountMapper userAccountMapper;

    /*
     * @description: 用户注册
     * @param: [userAccount]
     * @return: boolean
     */
    @Override
    public boolean insertAccount(UserAccount userAccount) {
        UserAccountExample userAccountExample = new UserAccountExample();
        userAccountExample.createCriteria().andAccountEqualTo(userAccount.getAccount());
        List<UserAccount> userAccounts = userAccountMapper.selectByExample(userAccountExample);
        if(userAccounts == null || userAccounts.size() == 0) {
            userAccountMapper.insert(userAccount);
            return true;
        }
        return false;
    }

    /*
     * @description: 检查账户是否已存在
     * @param: [account]
     * @return: boolean
     */
    @Override
    public boolean checkAccount(String account) {
        UserAccountExample userAccountExample = new UserAccountExample();
        userAccountExample.createCriteria().andAccountEqualTo(account);
        List<UserAccount> userAccounts = userAccountMapper.selectByExample(userAccountExample);
        return userAccounts != null;
    }

    /*
     * @description: 用户登录
     * @param: [userAccount]
     * @return: boolean
     */
    @Override
    public boolean login(UserAccount userAccount) {
        UserAccountExample userAccountExample = new UserAccountExample();
        userAccountExample.createCriteria().andAccountEqualTo(userAccount.getAccount()).andPsdEqualTo(userAccount.getPsd());
        List<UserAccount> userAccounts = userAccountMapper.selectByExample(userAccountExample);
        return userAccounts != null;
    }
}
