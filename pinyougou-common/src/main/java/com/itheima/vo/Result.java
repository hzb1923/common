package com.itheima.vo;

import java.io.Serializable;
//返回结果对象
public class Result implements Serializable {

    private Boolean success;//成功或者失败的标志
    private String message;//信息

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
