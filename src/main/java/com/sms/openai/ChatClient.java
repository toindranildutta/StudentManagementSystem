package com.sms.openai;

import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.Generation;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.model.ModelClient;

public interface ChatClient extends ModelClient<Prompt, ChatResponse> {

    // Method to directly call the chat model with a message and get a response
    default String call(String message) {
        // Create a Prompt object with the user's message
        Prompt prompt = new Prompt(new UserMessage(message));
        // Call the model to generate a response based on the prompt
        Generation generation = call(prompt).getResult();
        // Return the generated response content if available
        return (generation != null) ? generation.getOutput().getContent() : "";
    }

    // Override method to call the chat model with a prompt and get a response
    @Override
    ChatResponse call(Prompt prompt);
}
