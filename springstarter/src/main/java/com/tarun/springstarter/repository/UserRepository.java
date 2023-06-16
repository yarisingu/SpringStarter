package com.tarun.springstarter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tarun.springstarter.dto.UserDto;


@Repository
public interface UserRepository  extends MongoRepository<UserDto,Integer>{
    
}
