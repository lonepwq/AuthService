package com.pwq.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Resource {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 接口名称
     */
    @Column(unique = true, nullable = false)
    private String resourceName;

    /**
     * 接口描述
     */
    private String resourceDescription;

    /**
     * 接口类型
     */
    private String resourceType;

    /**
     * 接口所属controller
     */
    private String controllerName;
}
