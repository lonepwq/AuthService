package com.pwq.service.impl;

import com.pwq.model.entity.RoleResource;
import com.pwq.repository.RoleResourceRepository;
import com.pwq.service.RoleResourceService;
import org.springframework.stereotype.Service;

@Service
public class RoleResourceServiceImpl extends CommonServiceImpl<RoleResource, RoleResourceRepository> implements RoleResourceService {
    public RoleResourceServiceImpl(RoleResourceRepository repository) {
        super(repository);
    }
}
