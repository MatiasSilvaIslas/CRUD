package com.example.MVPProject.security.service;

import com.example.MVPProject.security.entity.Role;
import com.example.MVPProject.security.enums.RoleType;
import com.example.MVPProject.security.repository.RoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public Optional<Role> getByRoleType(RoleType roleType){
        return roleRepository.findByRoleType(roleType);
    }

}
