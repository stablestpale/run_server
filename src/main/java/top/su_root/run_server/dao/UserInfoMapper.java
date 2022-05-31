package top.su_root.run_server.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.su_root.run_server.entity.UserInfo;
import top.su_root.run_server.entity.UserInfoExample;

public interface UserInfoMapper {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);
}