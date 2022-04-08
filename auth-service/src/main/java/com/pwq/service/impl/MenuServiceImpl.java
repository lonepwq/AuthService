package com.pwq.service.impl;

import com.pwq.model.entity.Menu;
import com.pwq.repository.MenuRepository;
import com.pwq.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Menu create(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public Menu retrieveById(Integer id) {
        return menuRepository.findById(id).get();
    }

    @Override
    public Menu update(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public void delete(Menu menu) {
        menuRepository.delete(menu);
    }
}
