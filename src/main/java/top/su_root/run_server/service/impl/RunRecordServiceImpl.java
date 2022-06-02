package top.su_root.run_server.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.su_root.run_server.dao.RunRecordMapper;
import top.su_root.run_server.dao.RunTraceMapper;
import top.su_root.run_server.service.RunRecordService;

/**
 * @author zzy
 * @description:
 * @date 2022/5/30 15:13
 */


@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RunRecordServiceImpl implements RunRecordService {

    private final RunRecordMapper runRecordMapper;
    private final RunTraceMapper runTraceMapper;
}
