package com.sms.openai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SpringAIController {

    @Autowired
    SpringAIService aiService; // Autowired SpringAIService object for handling AI-related tasks

    // Endpoint for fetching a Result related to a specific topic
    @GetMapping("/task")
    public String getTask(@RequestParam String topic) {
        // Delegate the task of fetching a joke to the aiService
        return aiService.getTask(topic);
    }
}
