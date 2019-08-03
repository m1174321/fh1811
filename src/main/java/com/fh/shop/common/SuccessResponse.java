package com.fh.shop.common;

import org.utils.distributivesession.IEnum;

import java.io.Serializable;

public class SuccessResponse<T> implements Serializable {
    private static final long serialVersionUID = -2851160976712753385L;

    private int code;
    private String msg;
    private T data;

    //因为在json执行转换的时候需要一个无参的构造方法所以就给他提供一个也需要set方法
    public SuccessResponse() {

    }

    //公共的访问方法  无返回数据
    public static SuccessResponse success() {
        return new SuccessResponse(200, "ok", null);
    }//公共的访问方法  有返回数据

    public static <T> SuccessResponse<T> success(Object obj) {
        return new SuccessResponse(200, "ok", obj);
    }

    //普通异常
    public static SuccessResponse error() {
        return new SuccessResponse(-1, "失败", null);
    }

    //用户名或密码出现异常
    public static SuccessResponse error(IEnum responseEnum) {
        return new SuccessResponse(-1, "失败", null);
    }

    //生成私有化构造函数
    private SuccessResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }
}
