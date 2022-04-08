package com.pwq.service.impl;

import com.pwq.model.entity.RoleResource;
import com.pwq.repository.RoleResourceRepository;
import com.pwq.service.RoleResourceService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleResourceServiceImpl implements RoleResourceService {

    @Autowired
    private RoleResourceRepository roleResourceRepository;

    @Override
    public RoleResource create(RoleResource roleResource) {
        return roleResourceRepository.save(roleResource);
    }

    @Override
    public RoleResource retrieveById(Integer id) {
        return roleResourceRepository.findById(id).get();
    }

    @Override
    public RoleResource update(RoleResource roleResource) {
        return roleResourceRepository.save(roleResource);
    }

    @Override
    public void delete(RoleResource roleResource) {
        roleResourceRepository.delete(roleResource);
    }
}
