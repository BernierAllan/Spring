package com.allan.helloworld.model;

import java.time.LocalDateTime;

public class Message {
	private String author;
	private LocalDateTime date;
	private String message;
	
	public Message(String author, String message) {
		this.author = author;
		this.date = LocalDateTime.now();
		this.message = message;
	}
	
	public Message() {
		this.date = LocalDateTime.now();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
