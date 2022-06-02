package top.su_root.run_server.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.su_root.run_server.dao.AdminMapper;
import top.su_root.run_server.service.AdminService;

/**
 * @author zzy
 * @description:
 * @date 2022/6/2 11:05
 */


@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdminServiceImpl implements AdminService {
    private final AdminMapper adminMapper;
}
