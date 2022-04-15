package com.pwq.service.impl;


import com.pwq.model.entity.User;
import com.pwq.repository.UserRepository;
import com.pwq.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends CommonServiceImpl<User, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}
