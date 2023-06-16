package com.tarun.springstarter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tarun.springstarter.dto.User;

public interface UserRepository extends MongoRepository<User, String> {
    // Additional custom query methods can be added here if needed
}

