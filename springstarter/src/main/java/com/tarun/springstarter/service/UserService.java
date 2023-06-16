package com.tarun.springstarter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarun.springstarter.dao.UserDao;
import com.tarun.springstarter.dto.UserDto;

@Service
public class UserService {

    @Autowired
    UserDao dao;

    @Autowired 
    UserDto dto;

    public void login(int id, String name) {
        dto.setId(id);
        dto.setName(name);
        dao.login(dto);
    }


    
}
