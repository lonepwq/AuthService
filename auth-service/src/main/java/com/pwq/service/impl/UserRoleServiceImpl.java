package com.pwq.service.impl;


import com.pwq.model.entity.UserRole;
import com.pwq.repository.UserRoleRepository;
import com.pwq.service.UserRoleService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends CommonServiceImpl<UserRole, UserRoleRepository> implements UserRoleService {
    public UserRoleServiceImpl(UserRoleRepository repository) {
        super(repository);
    }
}
