package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.chatgpt.ChatRequest;
import com.example.demo.chatgpt.ChatResponse;
import com.example.demo.chatgpt.ChatgptProperties;
import com.example.demo.chatgpt.ChatgptService;

@SpringBootTest
class ChatgptGatewayTests {

	@Autowired
	private ChatgptService chatgpt;
	
	@Autowired
	private ChatgptProperties properties;

	@Test
	public void testChat() {
		ChatRequest request = ChatRequest.prompt("how are you", properties);
		ChatResponse response = chatgpt.chat(request);
		System.out.print(response.getChoices().get(0).getText()); //I'm doing well, thank you. How about you?
	}

}
