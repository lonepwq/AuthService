package com.pwq.common.constant;

/**
 * 公用异常编码
 */
public enum CommonErrorCodeEnum implements ErrorCodeEnum {

    E_100101(100101, "传入参数与接口不匹配"),

    E_100102(100102, "验证码错误"),

    E_100103(100103, "验证码为空"),

    E_100104(100104, "查询结果为空"),

    E_100105(100105, "ID格式不正确或超出Long存储范围"),

    E_100106(100106, "上传错误"),

    E_100107(100107, "发送验证码错误"),

    E_100108(100108, "传入对象为空"),

    E_100109(100109, "手机号格式不正确"),

    E_100110(100110, "用户名为空"),

    E_100111(100111, "密码为空"),

    E_100112(100112, "手机号为空"),

    E_100113(100113, "手机号已存在"),

    E_100114(100114, "用户名已存在"),

    E_100115(100115, "密码不正确"),


    E_NO_AUTHORITY(999997, "没有访问权限"),

    CUSTOM(999998, "自定义异常"),

    /**
     * 未知错误
     */
    UNKNOWN(999999, "未知错误"),

    /**
     * 成功，设置这个状态码的目的如下：
     * 1、前端调用接口接收到的http状态码都是200；
     * 2、然后解析内容只要不是成功的状态码。都弹窗提示用户；
     */
    SUCCESS(000000, "成功");

    private int code;
    private String message;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    CommonErrorCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}

