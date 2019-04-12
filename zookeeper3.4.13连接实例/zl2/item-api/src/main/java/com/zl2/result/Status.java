package com.zl2.result;

public enum Status {
    SUCCESS(0, "成功"),
    FAIL(1, "失败"),
    // 支付模块
    PAY_FAIL(500001, "支付失败");

    private int code;
    private String msg;

    Status(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }
}
