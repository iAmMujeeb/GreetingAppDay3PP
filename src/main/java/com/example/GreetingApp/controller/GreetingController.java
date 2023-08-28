package com.example.greetingapp.controller;

import com.example.greetingapp.model.User;
import com.example.greetingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public String messageHelloGet(@RequestBody User user){
        return user.getMessage()+"!";
    }

    @PostMapping("/post")
    public String messageHelloPost(@RequestBody User user){
        return user.getMessage()+"!";
    }

    @PutMapping("/put/{firstName}")
    public String messageHelloPut(@RequestBody User user){
        return user.getMessage()+"!";
    }

    @PostMapping("/add")
    public User addMessage(@RequestBody User user){
        return userService.addUser(user);
    }

}
