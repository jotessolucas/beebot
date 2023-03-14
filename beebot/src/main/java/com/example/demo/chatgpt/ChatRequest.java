package com.example.demo.chatgpt;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatRequest {
	
    private String model;
    private String prompt;
    @JsonProperty("max_tokens")
    private Integer maxTokens;
    private Double temperature;
    @JsonProperty("top_p")
    private Double topP;

    public static ChatRequest valueOf(ChatgptProperties properties) {
        return new ChatRequest(properties.getModel(), "",
        		properties.getMaxTokens(), properties.getTemperature(), properties.getTopP());
    }

    public static ChatRequest prompt(String prompt, ChatgptProperties properties) {
    	ChatRequest request = valueOf(properties);
    	request.setPrompt(prompt);
    	
    	return request;
    }

	public ChatRequest(String model, String prompt, Integer maxTokens, Double temperature, Double topP) {
		super();
		this.model = model;
		this.prompt = prompt;
		this.maxTokens = maxTokens;
		this.temperature = temperature;
		this.topP = topP;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public Integer getMaxTokens() {
		return maxTokens;
	}

	public void setMaxTokens(Integer maxTokens) {
		this.maxTokens = maxTokens;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public Double getTopP() {
		return topP;
	}

	public void setTopP(Double topP) {
		this.topP = topP;
	}
    
}
