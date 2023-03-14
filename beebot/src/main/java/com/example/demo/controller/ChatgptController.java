package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.chatgpt.ChatRequest;
import com.example.demo.chatgpt.ChatResponse;
import com.example.demo.chatgpt.ChatgptProperties;
import com.example.demo.chatgpt.ChatgptService;

@RestController
public class ChatgptController {

	@Autowired
	private ChatgptService chatgpt;
	
	@Autowired
	private ChatgptProperties properties;
	
	@GetMapping("/chat")
	public String chat(@RequestParam(name = "p") String prompt) {
		ChatRequest request = ChatRequest.prompt(prompt, properties);
		ChatResponse response = chatgpt.chat(request);
		return response.getChoices().get(0).getText();
	}
}
