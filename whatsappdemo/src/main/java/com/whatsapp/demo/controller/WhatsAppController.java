package com.whatsapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsAppController {
	@GetMapping("/Loginn")
	public String Loginin()
	{
		return "Login successful";
	}

	@GetMapping("/Signup/{username}")
	public String Signup(@PathVariable("username") String username)
	{
		return "Login successful "+username;
	}

}
