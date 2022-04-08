package com.pwq.service;

public interface CommonService<T> {

    T create(T t);

    T retrieveById(Integer id);

    T update(T t);

    void delete(T t);
}
