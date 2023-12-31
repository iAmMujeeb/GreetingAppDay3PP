package com.example.greetingapp.service;

import com.example.greetingapp.model.GreetingApp;
import com.example.greetingapp.repository.GreetingAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
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

    @Override
    public List<GreetingApp> getAllMessage() {
        return userRepository.findAll();
    }

    @Override
    public GreetingApp updateMessage(int id, GreetingApp greetingApp) {
        Optional<GreetingApp> messageData = getMessageById(id);
        if (messageData.isPresent()) {
            messageData.get().setMessage(greetingApp.getMessage());
            return userRepository.save(messageData.get());
        }
        return null;
    }

    @Override
    public String deleteMessageById(int id) {
        Optional<GreetingApp> userData = getMessageById(id);
        if (userData.isPresent()) {
            userRepository.deleteById(id);
            return "User Deleted Successfully!";
        }
        return "Failed!";
    }

}
