package com.example.demo.auth;

import static java.util.Objects.requireNonNull;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class ApiKeyAuthRequestInterceptor implements RequestInterceptor {

	private final String headerValue;
	
	public ApiKeyAuthRequestInterceptor(String key) {
		this.headerValue = "Bearer " + requireNonNull(key);
	}
	
	@Override
	public void apply(RequestTemplate template) {
		template.header("Authorization", headerValue);
	}

}
