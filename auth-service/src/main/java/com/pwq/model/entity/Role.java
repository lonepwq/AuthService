package com.pwq.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Role {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色名称
     */
    @Column(unique = true, nullable = false)
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDescription;

    /**
     * 角色类型
     */
    private String roleType;
}
