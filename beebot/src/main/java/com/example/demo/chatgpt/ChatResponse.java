package com.example.demo.chatgpt;

import java.time.LocalDate;
import java.util.List;

import io.github.flashvayne.chatgpt.dto.Choice;
import io.github.flashvayne.chatgpt.dto.Usage;

public class ChatResponse {

	private String id;
	private String object;
	private LocalDate created;
	private String model;
	private List<Choice> choices;
	private Usage usage;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

	public Usage getUsage() {
		return usage;
	}

	public void setUsage(Usage usage) {
		this.usage = usage;
	}

}
