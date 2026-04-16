package com.qst.medical.util;

import java.util.HashMap;
import java.util.Map;

public class Msg {

    private Integer code;
    private String message;
    private boolean success;
    private Map<String, Object> data = new HashMap<>();

    /**
     * 响应成功函数
     */
    public static Msg success() {
        Msg msg = new Msg();
        msg.setCode(20000);
        msg.setMessage("响应成功");
        msg.setSuccess(true);
        return msg;
    }

    /**
     * 响应失败函数
     */
    public static Msg fail() {
        Msg msg = new Msg();
        msg.setCode(10000);
        msg.setMessage("响应失败");
        msg.setSuccess(false);
        return msg;
    }

    /**
     * 添加响应数据
     */
    public Msg data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    /**
     * 修改状态码
     */
    public Msg code(Integer code) {
        this.setCode(code);
        return this;
    }

    /**
     * 修改消息
     */
    public Msg mess(String str) {
        this.setMessage(str);
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
