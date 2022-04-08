package com.pwq.repository;

import com.pwq.model.entity.RoleMenu;
import com.pwq.model.entity.RoleResource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleResourceRepository extends JpaRepository<RoleResource, Integer> {
}
