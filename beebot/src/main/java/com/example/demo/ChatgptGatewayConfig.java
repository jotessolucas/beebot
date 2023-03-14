package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.auth.ApiKeyAuthRequestInterceptor;
import com.example.demo.chatgpt.ChatgptProperties;

import feign.RequestInterceptor;

@Configuration
public class ChatgptGatewayConfig {

	@Bean
	public RequestInterceptor basicAuthRequestInterceptor(ChatgptProperties properties) {
	    return new ApiKeyAuthRequestInterceptor(properties.getApiKey());
	}
	
}
