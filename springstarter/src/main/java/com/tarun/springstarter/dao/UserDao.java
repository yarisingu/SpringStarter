package com.tarun.springstarter.dao;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.tarun.springstarter.dto.UserDto;
import com.tarun.springstarter.repository.UserRepository;



@Repository
public class UserDao {

   @Autowired
    private UserRepository repo;

    public void login(UserDto dto) {
        repo.save(dto);
        
    }

    

}
