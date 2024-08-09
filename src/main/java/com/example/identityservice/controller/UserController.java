package com.example.identityservice.controller;

import com.example.identityservice.dto.request.UserCreationRequest;
import com.example.identityservice.dto.request.UserUpdationRequest;
import com.example.identityservice.entity.User;
import com.example.identityservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request){
        return userService.createUser(request);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable("userId") String userId, @RequestBody UserUpdationRequest request){
        return userService.updateUser(userId, request);
    }

    @GetMapping
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }

    @DeleteMapping("/{userId}")
    String delete(@PathVariable("userId") String userId){
        userService.deleteUser(userId);
        return "Delete successful";
    }

}
