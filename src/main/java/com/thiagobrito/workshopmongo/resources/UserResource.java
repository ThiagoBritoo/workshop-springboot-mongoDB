package com.thiagobrito.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagobrito.workshopmongo.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        var maria = new User("1", "Maria Silva", "maria@gmail.com");
        var alex = new User("1", "Alex Brito", "alex@gmail.com");
        var john = new User("1", "John Sabia", "john@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, alex, john));
        return ResponseEntity.ok().body(list);
    }


    
}
