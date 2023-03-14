package com.example.demo.chatgpt;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "chatgpt", url = "https://api.openai.com/v1/completions")
public interface ChatgptService {

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ChatResponse chat(ChatRequest request);
}
