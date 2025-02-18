package com.example.springbootintro.Repository;

import com.example.springbootintro.Model.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WelcomeRepository {
    private int messageId = 1;
    private final List<Message> messages = new ArrayList<>();

    public WelcomeRepository() {
        populateMessages();

    }

    public List<Message> getAllMessages() {
        return messages;
    }

    private void populateMessages(){
        while(messageId <=3){
            messages.add(new Message(messageId,"Velkommen til " + messageId + ".semester"));
        }
    }
}
