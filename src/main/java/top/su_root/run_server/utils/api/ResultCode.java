package top.su_root.run_server.utils.api;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author zzy
 * @description:
 * @date 2022/6/5 11：11
 */


@NoArgsConstructor
@AllArgsConstructor
public enum ResultCode implements IErrorCode {
    SUCCESS(200L, "操作成功"),
    FAILED(500L, "操作失败"),
    VALIDATE_FAILED(404L, "参数检验失败"),
    UNAUTHORIZED(401L, "暂未登录或token已经过期"),
    FORBIDDEN(403L, "没有相关权限");

    private Long code;
    private String message;

    @Override
    public Long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
