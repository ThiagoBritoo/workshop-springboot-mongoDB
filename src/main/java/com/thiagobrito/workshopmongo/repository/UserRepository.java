package com.thiagobrito.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.thiagobrito.workshopmongo.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
    
}
