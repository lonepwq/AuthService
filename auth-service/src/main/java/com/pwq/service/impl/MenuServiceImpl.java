package com.pwq.service.impl;

import com.pwq.model.entity.Menu;
import com.pwq.repository.MenuRepository;
import com.pwq.service.MenuService;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends CommonServiceImpl<Menu, MenuRepository> implements MenuService {
    public MenuServiceImpl(MenuRepository repository) {
        super(repository);
    }
}
