package top.su_root.run_server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zzy
 * @description:
 * @date 2022/5/30 14:52
 */

@Configuration
@MapperScan({"top.su_root.run_server.dao.mapper", "top.su_root.run_server.dao"})
public class MyBatisConfig {
}
