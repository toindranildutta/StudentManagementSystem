package com.sms.openai;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringAIService {

    @Autowired
    ChatClient chatClient; // Autowired ChatClient object for interacting with the chat model

    // Method to get a task related to a specific topic from the chat client
    public String getTask(String topic){
        // Call the chat client with the provided topic and get the response
        return chatClient.call(topic);
    }
}
