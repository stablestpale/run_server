package top.su_root.run_server.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.su_root.run_server.dao.UserAccountMapper;
import top.su_root.run_server.service.UserAccountService;

/**
 * @author zzy
 * @description:
 * @date 2022/5/30 15:13
 */


@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountMapper userAccountMapper;
}
