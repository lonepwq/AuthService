package com.pwq.service.impl;

import com.pwq.model.entity.Resource;
import com.pwq.repository.ResourceRepository;
import com.pwq.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;

public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    @Override
    public Resource create(Resource resource) {
        return resourceRepository.save(resource);
    }

    @Override
    public Resource retrieveById(Integer id) {
        return resourceRepository.findById(id).get();
    }

    @Override
    public Resource update(Resource resource) {
        return resourceRepository.save(resource);
    }

    @Override
    public void delete(Resource resource) {
        resourceRepository.delete(resource);
    }
}
