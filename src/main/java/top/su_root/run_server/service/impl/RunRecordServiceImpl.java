package top.su_root.run_server.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.su_root.run_server.dao.RunRecordMapper;
import top.su_root.run_server.dao.RunTraceMapper;
import top.su_root.run_server.entity.RunRecord;
import top.su_root.run_server.entity.RunRecordExample;
import top.su_root.run_server.entity.RunTrace;
import top.su_root.run_server.entity.RunTraceExample;
import top.su_root.run_server.service.RunRecordService;

import java.util.ArrayList;
import java.util.List;

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

    /*
     * @description: 添加记录
     * @param: [runRecord]
     * @return: void
     */
    @Override
    public void insertRunRecord(RunRecord runRecord) {
        int recordId = runRecordMapper.insert(runRecord);
        String[] traces = runRecord.getPath().split(",");
        for(String trace: traces) {
            RunTrace runTrace = new RunTrace(recordId, trace);
            runTraceMapper.insert(runTrace);
        }
    }

    /*
     * @description: 获取个人账户记录
     * @param: [account]
     * @return: List<RunRecord>
     */
    @Override
    public List<RunRecord> queryRunRecordListByAccount(String account) {
        RunRecordExample runRecordExample = new RunRecordExample();
        runRecordExample.createCriteria().andAccountEqualTo(account);
        return runRecordMapper.selectByExample(runRecordExample);
    }

    /*
     * @description: 获取某天记录
     * @param: [account, dateTag]
     * @return: List<RunRecord>
     */
    @Override
    public List<RunRecord> queryRunRecordListByAccountAndDate(String account, String dateTag) {
        RunRecordExample runRecordExample = new RunRecordExample();
        runRecordExample.createCriteria().andAccountEqualTo(account).andDateTagEqualTo(dateTag);
        return runRecordMapper.selectByExample(runRecordExample);
    }

    /*
     * @description: 按时间获取记录
     * @param: [account, startTime, endTime]
     * @return: RunRecord
     */
    @Override
    public RunRecord queryRecord(String account, String startTime, String endTime) {
        RunRecordExample runRecordExample = new RunRecordExample();
        runRecordExample.createCriteria().andAccountEqualTo(account).andMStartTimeEqualTo(startTime).andMEndTimeEqualTo(endTime);
        List<RunRecord> runRecords = runRecordMapper.selectByExample(runRecordExample);
        if(runRecords.size() != 1) {
            return null;
        }
        return runRecords.get(0);
    }

    /*
     * @description: 获取跑步的轨迹
     * @param: [recordId]
     * @return: List<RunTrace>
     */
    @Override
    public List<RunTrace> queryRunTraceListByRecordId(Integer recordId) {
        RunTraceExample runTraceExample = new RunTraceExample();
        runTraceExample.createCriteria().andRecordIdEqualTo(recordId);
        return runTraceMapper.selectByExample(runTraceExample);
    }
}
