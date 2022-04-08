package com.pwq.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Menu {

    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 菜单名称
     */
    @Column(unique = true, nullable = false)
    private String menuName;

    /**
     * 菜单描述
     */
    private String menuDescription;

    /**
     * 菜单类型
     */
    private String menuType;
}
