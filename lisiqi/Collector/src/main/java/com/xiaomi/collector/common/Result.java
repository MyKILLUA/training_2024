package com.xiaomi.collector.common;

public class Result {
    private String code;
    private String msg;
    private Object data;

    public Result(){}

    public String getCode() {
        return code;
    }
    public void setCode(String code){
        this.code=code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result(String code, String msg, Object data) {
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public static Result success(Object data) {
        return new Result(Constants.CODE_200, "", data);
    }

    public static Result error(String code, String msg) {
        return new Result(code, msg, null);
    }

    public static Result error(Object data) {
        return new Result(Constants.CODE_500, "系统错误", data);
    }
}
