package com.example.greetingapp.service;

import com.example.greetingapp.model.GreetingApp;
import com.example.greetingapp.repository.GreetingAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingAppServiceImp implements GreetingAppService {

    @Autowired
    private GreetingAppRepository userRepository;

    @Override
    public GreetingApp addUser(GreetingApp user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<GreetingApp> getMessageById(int id) {
        return userRepository.findById(id);
    }

}
