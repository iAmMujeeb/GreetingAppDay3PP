package com.example.greetingapp.controller;

import com.example.greetingapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

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

}
