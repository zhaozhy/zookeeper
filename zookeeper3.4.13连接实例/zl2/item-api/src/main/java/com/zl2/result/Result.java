package com.zl2.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private int code; // 编码
    private String msg; // 状态
    private Object data; // 响应的数据


    public static Result success() {
        return new Result(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg(), null);
    }

    public static Result success(Object data) {
        return new Result(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg(), data);
    }

    public static Result error() {
        return new Result(Status.FAIL.getCode(), Status.FAIL.getMsg(), null);
    }

}
