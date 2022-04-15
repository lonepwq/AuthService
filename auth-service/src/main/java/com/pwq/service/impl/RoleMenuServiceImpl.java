package com.pwq.service.impl;

import com.pwq.model.entity.RoleMenu;
import com.pwq.repository.RoleMenuRepository;
import com.pwq.service.RoleMenuService;
import org.springframework.stereotype.Service;

@Service
public class RoleMenuServiceImpl extends CommonServiceImpl<RoleMenu, RoleMenuRepository> implements RoleMenuService {
    public RoleMenuServiceImpl(RoleMenuRepository repository) {
        super(repository);
    }
}
