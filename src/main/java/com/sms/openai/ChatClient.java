package com.sms.openai;

import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.model.ModelClient;

@FunctionalInterface
public interface ChatClient extends ModelClient<Prompt, ChatResponse> {

	default String call(String message) {
		Prompt prompt = new Prompt(new UserMessage(message));
		return call(prompt).getResult().getOutput().getContent();
	}

	ChatResponse call(Prompt prompt);
}