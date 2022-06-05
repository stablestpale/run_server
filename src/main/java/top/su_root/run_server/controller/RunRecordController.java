package top.su_root.run_server.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.su_root.run_server.entity.RunRecord;
import top.su_root.run_server.service.RunRecordService;
import top.su_root.run_server.utils.PermissionHelper;
import top.su_root.run_server.utils.api.BaseResult;

import javax.management.Query;
import java.util.List;

import static top.su_root.run_server.utils.ConstUtil.*;
import static top.su_root.run_server.utils.ConstUtil.API_GET_USERS;

/**
 * @author zzy
 * @description:
 * @date 2022/5/30 15:09
 */

@Api(tags = RUN_RECORD)
@CrossOrigin
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RunRecordController {
    private final RunRecordService runRecordService;

    /*
     * @description: 增加跑步数据
     * @param: [record]
     * @return: BaseResult<String>
     */
    @PostMapping(ADD_RECORD)
    @ApiOperation(API_ADD_RECORD)
    @ApiImplicitParam(name = "token", value = "token", required = true, paramType = "header", dataTypeClass = String.class)
    @PermissionHelper(PermissionHelper.USER)
    public BaseResult<String> insertRunRecord(@RequestBody RunRecord record) {
        runRecordService.insertRunRecord(record);
        return BaseResult.success(QUERY_SUCCESS);
    }

    /*
     * @description: 获取用户的跑步数据
     * @param: [account]
     * @return: BaseResult<List<RunRecord>>
     */
    @GetMapping(GET_RCD_LIST)
    @ApiOperation(API_GET_RCD_LIST)
    @ApiImplicitParam(name = "token", value = "token", required = true, paramType = "header", dataTypeClass = String.class)
    @PermissionHelper(PermissionHelper.USER)
    public BaseResult<List<RunRecord>> queryRecordList(@RequestHeader String account) {
        List<RunRecord> runRecords = runRecordService.queryRunRecordListByAccount(account);
        return BaseResult.success(runRecords, QUERY_SUCCESS);
    }

    /*
     * @description: 获取用户某天的跑步数据
     * @param: [account, dateTag]
     * @return: BaseResult<List<RunRecord>>
     */
    @GetMapping(GET_RCD_BY_DATE)
    @ApiOperation(API_GET_RCD_BY_DATE)
    @ApiImplicitParam(name = "token", value = "token", required = true, paramType = "header", dataTypeClass = String.class)
    @PermissionHelper(PermissionHelper.USER)
    public BaseResult<List<RunRecord>> queryRecordByDate(@RequestHeader String account, @RequestHeader String dateTag) {
        List<RunRecord> runRecords = runRecordService.queryRunRecordListByAccountAndDate(account, dateTag);
        return BaseResult.success(runRecords, QUERY_SUCCESS);
    }


    /*
     * @description: 获取跑步数据
     * @param: [account, startTime, endTime]
     * @return: BaseResult<RunRecord>
     */
    @GetMapping(GET_RCD)
    @ApiOperation(API_GET_RCD)
    @ApiImplicitParam(name = "token", value = "token", required = true, paramType = "header", dataTypeClass = String.class)
    @PermissionHelper(PermissionHelper.USER)
    public BaseResult<RunRecord> queryRecordByRecordId(@RequestHeader Integer id) {
        RunRecord runRecord = runRecordService.queryRecord(id);
        return BaseResult.success(runRecord);
    }
}
