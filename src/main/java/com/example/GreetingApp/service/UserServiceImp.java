package com.example.greetingapp.service;

import com.example.greetingapp.model.User;
import com.example.greetingapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
