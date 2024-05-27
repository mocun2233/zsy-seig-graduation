package com.seig.zsy.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  //添加无参构造
@AllArgsConstructor //添加全参构造
public class ResponseResult<T> {
    private int code; // 状态码
    private String message; // 消息
    private T data; // 数据

    // 成功时调用的方法，仅返回数据
    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<>(200, "操作成功", data);
    }

    // 成功时调用的方法，可定制消息
    public static <T> ResponseResult<T> success(String message, T data) {
        return new ResponseResult<>(200, message, data);
    }

    // 失败时调用的方法，需要指定错误码和消息
    public static <T> ResponseResult<T> error(int code, String message) {
        return new ResponseResult<>(code, message, null);
    }

    // 失败时调用的方法，仅需消息，假设默认错误码为500
    public static <T> ResponseResult<T> error(String message) {
        return new ResponseResult<>(500, message, null);
    }
}