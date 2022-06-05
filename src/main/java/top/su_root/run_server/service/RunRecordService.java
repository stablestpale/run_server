package top.su_root.run_server.service;

import top.su_root.run_server.entity.RunRecord;
import top.su_root.run_server.entity.RunTrace;

import java.util.List;

/**
 * @author zzy
 * @description:
 * @date 2022/5/30 15:13
 */

public interface RunRecordService {
    void insertRunRecord(RunRecord runRecord);

    List<RunRecord> queryRunRecordListByAccount(String account);

    List<RunRecord> queryRunRecordListByAccountAndDate(String account, String dateTag);

    RunRecord queryRecord(Integer id);

    List<RunTrace> queryRunTraceListByRecordId(Integer recordId);
}
