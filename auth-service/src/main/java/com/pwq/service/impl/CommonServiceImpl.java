package com.pwq.service.impl;

import com.pwq.service.CommonService;
import org.springframework.data.jpa.repository.JpaRepository;

public class CommonServiceImpl<E, R extends JpaRepository<E, Integer>> implements CommonService<E> {

    protected R repository;

    public CommonServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public E create(E entity) {
        return repository.save(entity);
    }

    @Override
    public E retrieveById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public E update(E entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(E entity) {
        repository.delete(entity);
    }
}
