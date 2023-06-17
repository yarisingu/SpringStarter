package com.tarun.springstarter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarun.springstarter.dto.User;
import com.tarun.springstarter.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user).getId();
    }
}

