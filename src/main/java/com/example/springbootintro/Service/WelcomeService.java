package com.example.springbootintro.Service;

import com.example.springbootintro.Model.Message;
import com.example.springbootintro.Repository.WelcomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class WelcomeService {
    private final WelcomeRepository welcomeRepository;

    public WelcomeService(WelcomeRepository welcomeRepository) {
        this.welcomeRepository = welcomeRepository;
    }
    public List<Message> getAllMessages() {
        return welcomeRepository.getAllMessages();
    }
}
