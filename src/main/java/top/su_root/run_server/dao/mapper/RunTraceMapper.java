package top.su_root.run_server.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.su_root.run_server.entity.RunTrace;
import top.su_root.run_server.entity.RunTraceExample;

public interface RunTraceMapper {
    long countByExample(RunTraceExample example);

    int deleteByExample(RunTraceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RunTrace record);

    int insertSelective(RunTrace record);

    List<RunTrace> selectByExample(RunTraceExample example);

    RunTrace selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RunTrace record, @Param("example") RunTraceExample example);

    int updateByExample(@Param("record") RunTrace record, @Param("example") RunTraceExample example);

    int updateByPrimaryKeySelective(RunTrace record);

    int updateByPrimaryKey(RunTrace record);
}