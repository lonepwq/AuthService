package com.pwq.service.impl;

import com.pwq.model.entity.Role;
import com.pwq.repository.RoleRepository;
import com.pwq.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role create(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role retrieveById(Integer id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public Role update(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void delete(Role role) {
        roleRepository.delete(role);
    }
}
