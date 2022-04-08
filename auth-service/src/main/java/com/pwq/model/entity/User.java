package com.pwq.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户昵称
     */
    @Column(unique = true, nullable = false)
    private String name;

    /**
     * 用户登录账号
     */
    @Column(unique = true, nullable = false)
    private String account;

    /**
     * 用户登录密码
     */
    @Column(nullable = false)
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
