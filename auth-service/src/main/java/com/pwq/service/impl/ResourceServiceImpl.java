package com.pwq.service.impl;

import com.pwq.model.entity.Resource;
import com.pwq.repository.ResourceRepository;
import com.pwq.service.ResourceService;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl extends CommonServiceImpl<Resource, ResourceRepository> implements ResourceService {
    public ResourceServiceImpl(ResourceRepository repository) {
        super(repository);
    }
}
