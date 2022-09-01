package com.allan.helloworld.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.allan.helloworld.model.Message;

@Controller
public class MessageController {
	
	private List<Message> messageList = new ArrayList<Message>();
	
	@GetMapping("/messages")
	public String showMessages(Model model) {
		
		model.addAttribute("messageList", messageList);
		model.addAttribute("newMessage", new Message());
		
		return "MessagePage";
	}
	
	@PostMapping("/messages")
	public String postMessage(@ModelAttribute Message newMessage) {
		messageList.add(newMessage);
		
		return "redirect:messages";
		
	}
	
	
	
}
