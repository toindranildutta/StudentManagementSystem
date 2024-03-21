package com.sms.openai;

import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.ai.parser.BeanOutputParser;
import org.springframework.stereotype.Service;

@Service
public class OpenAiService {
	
	private final OpenAiChatClient client;
	
	 public OpenAiService(OpenAiChatClient aiClient) 
	 { this.client = aiClient; 
	 
	 }
	
public JobReasons formattedJobReasons(int count, String job, String location) {
	final String promptText = """
			Write {count} reasons why people in {location} should consider a {job} job.
			These reasons need to be short, so they fit on a poster.
			For instance, "{job} jobs are rewarding."
			{format}
			""";

	BeanOutputParser<JobReasons> outputParser = new BeanOutputParser<>(JobReasons.class);

	final PromptTemplate promptTemplate = new PromptTemplate(promptText);
	promptTemplate.add("count", count);
	promptTemplate.add("job", job);
	promptTemplate.add("location", location);

	promptTemplate.add("format", outputParser.getFormat());
	promptTemplate.setOutputParser(outputParser);

	final Prompt prompt = promptTemplate.create();

	ChatResponse response = client.call(prompt);
	return outputParser.parse(response.getResult().getOutput().getContent());
}
}










//import org.springframework.ai.chat.ChatResponse;
//import org.springframework.ai.chat.prompt.PromptTemplate;
//import org.springframework.ai.openai.OpenAiChatClient;
//import org.springframework.stereotype.Service;
//
//@Service
//public class OpenAiService {
//	
//    private final OpenAiChatClient client;
//	
//	 public OpenAiService(OpenAiChatClient aiClient) 
//	 { this.client = aiClient; 
//	 
//	 }
//	 
//	
//	public String jobReasons(int count, String domain, String location) {
//        final String promptText = """
//                Write {count} reasons why people in {location} should consider a {job} job.
//                These reasons need to be short, so they fit on a poster.
//                For instance, "{job} jobs are rewarding."
//                """;
//
//        final PromptTemplate promptTemplate = new PromptTemplate(promptText);
//        promptTemplate.add("count", count);
//        promptTemplate.add("job", domain);
//        promptTemplate.add("location", location);
//
//        ChatResponse response = client.call(promptTemplate.create());
//        return response.getResult().getOutput().getContent();
//    }
//}
