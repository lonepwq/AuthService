package com.pwq.model.dto;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class UserDto {

    /**
     * 用户昵称
     */
    private String name;

    /**
     * 用户登录账号
     */
    private String account;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户手机号
     */
    private String mobile;

    /**
     * 用户类型
     */
    private String type;

    /**
     * 用户状态
     */
    private String state;
}
