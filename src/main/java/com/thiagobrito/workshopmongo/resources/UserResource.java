package com.thiagobrito.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagobrito.workshopmongo.dtos.UserDto;
import com.thiagobrito.workshopmongo.entities.User;
import com.thiagobrito.workshopmongo.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> findAll(){
        List<User> list = userService.findAll();
        List<UserDto> listDto = list.stream().map(x -> new UserDto(x.getId(), x.getName(), x.getEmail())).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }    
}
