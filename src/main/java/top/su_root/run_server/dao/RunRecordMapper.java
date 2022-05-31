package top.su_root.run_server.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.su_root.run_server.entity.RunRecord;
import top.su_root.run_server.entity.RunRecordExample;

public interface RunRecordMapper {
    long countByExample(RunRecordExample example);

    int deleteByExample(RunRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RunRecord record);

    int insertSelective(RunRecord record);

    List<RunRecord> selectByExampleWithBLOBs(RunRecordExample example);

    List<RunRecord> selectByExample(RunRecordExample example);

    RunRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RunRecord record, @Param("example") RunRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") RunRecord record, @Param("example") RunRecordExample example);

    int updateByExample(@Param("record") RunRecord record, @Param("example") RunRecordExample example);

    int updateByPrimaryKeySelective(RunRecord record);

    int updateByPrimaryKeyWithBLOBs(RunRecord record);

    int updateByPrimaryKey(RunRecord record);
}