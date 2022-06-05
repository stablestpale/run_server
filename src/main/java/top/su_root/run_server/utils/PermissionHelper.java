package top.su_root.run_server.utils;

import java.lang.annotation.*;

/**
 * @author zzy
 * @description: token所属类
 * @date 2022/6/5 12:48
 */


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface PermissionHelper {
    String ADMIN = "Admin";

    String USER = "User";

    String value();

}
