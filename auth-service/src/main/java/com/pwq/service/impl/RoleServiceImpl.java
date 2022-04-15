package com.pwq.service.impl;

import com.pwq.model.entity.Role;
import com.pwq.repository.RoleRepository;
import com.pwq.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends CommonServiceImpl<Role, RoleRepository> implements RoleService {
    public RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }
}
