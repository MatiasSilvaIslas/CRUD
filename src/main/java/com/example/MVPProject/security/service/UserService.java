package com.example.MVPProject.security.service;

import com.example.MVPProject.security.entity.User;
import com.example.MVPProject.security.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Optional<User> getByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
    public boolean existByUserName(String userName){
        return userRepository.existsByUserName(userName);
    }

    public boolean existByEmail(String email){
        return userRepository.existsByEmail(email);
    }

    public void save (User user){
        userRepository.save(user);
    }

    public Optional<User> getByNombreUsuarioOrEmail(String nombreOrEmail){
        return userRepository.findByUserNameOrEmail(nombreOrEmail, nombreOrEmail);
    }
}
