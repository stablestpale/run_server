package top.su_root.run_server.service;

import top.su_root.run_server.entity.UserAccount;

/**
 * @author zzy
 * @description:
 * @date 2022/5/30 15:12
 */

public interface UserAccountService {

    boolean insertAccount(UserAccount userAccount);

    boolean checkAccount(String account);

    boolean login(UserAccount userAccount);
}
