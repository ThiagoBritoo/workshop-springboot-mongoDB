package com.thiagobrito.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagobrito.workshopmongo.entities.User;
import com.thiagobrito.workshopmongo.repository.UserRepository;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    
}
