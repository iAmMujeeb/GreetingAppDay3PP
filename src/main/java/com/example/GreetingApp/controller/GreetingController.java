package com.example.greetingapp.controller;

import com.example.greetingapp.model.GreetingApp;
import com.example.greetingapp.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @Autowired
    private GreetingAppService userService;

    @GetMapping("/get")
    public String messageHelloGet(@RequestBody GreetingApp user) {
        return user.getMessage() + "!";
    }

    @PostMapping("/post")
    public String messageHelloPost(@RequestBody GreetingApp user) {
        return user.getMessage() + "!";
    }

    @PutMapping("/put/{firstName}")
    public String messageHelloPut(@RequestBody GreetingApp user) {
        return user.getMessage() + "!";
    }

    @PostMapping("/add")
    public GreetingApp addMessage(@RequestBody GreetingApp user) {
        return userService.addUser(user);
    }

    @PostMapping("/messageWithName")
    public String messageWithName(@RequestBody GreetingApp greetingApp) {
        if ((greetingApp.getFirstName() == null) && (greetingApp.getLastName() == null)) {
            return "Hello World!";
        } else {
            return "Hello " + greetingApp.getFirstName() + " " + greetingApp.getLastName() + "!";
        }
    }


}
