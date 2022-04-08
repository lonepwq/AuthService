package com.pwq.service.impl;

import com.pwq.model.entity.RoleMenu;
import com.pwq.repository.RoleMenuRepository;
import com.pwq.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleMenuServiceImpl implements RoleMenuService {

    @Autowired
    private RoleMenuRepository roleMenuRepository;

    @Override
    public RoleMenu create(RoleMenu roleMenu) {
        return roleMenuRepository.save(roleMenu);
    }

    @Override
    public RoleMenu retrieveById(Integer id) {
        return roleMenuRepository.findById(id).get();
    }

    @Override
    public RoleMenu update(RoleMenu roleMenu) {
        return roleMenuRepository.save(roleMenu);
    }

    @Override
    public void delete(RoleMenu roleMenu) {
        roleMenuRepository.delete(roleMenu);
    }
}
