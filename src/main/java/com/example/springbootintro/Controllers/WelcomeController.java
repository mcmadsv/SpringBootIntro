package com.example.springbootintro.Controllers;

import com.example.springbootintro.Model.Message;
import com.example.springbootintro.Service.WelcomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    private final WelcomeService welcomeService;


    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }
    @GetMapping("")
    public ResponseEntity<List<Message>> getMessages() {
        List<Message> messages = welcomeService.getAllMessages();
        return new ResponseEntity<>(messages , HttpStatus.OK);
    }

}