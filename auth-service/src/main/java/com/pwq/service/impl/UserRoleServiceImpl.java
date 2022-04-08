package com.pwq.service.impl;


import com.pwq.model.entity.UserRole;
import com.pwq.repository.UserRoleRepository;
import com.pwq.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public UserRole create(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public UserRole retrieveById(Integer id) {
        return userRoleRepository.findById(id).get();
    }

    @Override
    public UserRole update(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public void delete(UserRole userRole) {
        userRoleRepository.delete(userRole);
    }
}
