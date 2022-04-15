package com.pwq.service;

public interface CommonService<E> {

    E create(E entity);

    E retrieveById(Integer id);

    E update(E entity);

    void delete(E entity);
}
