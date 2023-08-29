package com.example.greetingapp.service;

import com.example.greetingapp.model.GreetingApp;

import java.util.Optional;

public interface GreetingAppService {
    GreetingApp addUser(GreetingApp user);

    Optional<GreetingApp> getMessageById(int id);
}
