package com.example.pdplearn.controller;

import com.example.pdplearn.entity.entityTraining.Users;
import com.example.pdplearn.object.UsersDto;
import com.example.pdplearn.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired(required = true)
    UsersService usersService;

    @PostMapping("/create")
    public Users saveUsers(@RequestBody UsersDto usersDto){
        return usersService.saveUsers(usersDto);
    }
}
