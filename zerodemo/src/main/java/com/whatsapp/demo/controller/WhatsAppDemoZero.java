package com.whatsapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsAppDemoZero {
	@GetMapping("/zero")
	public String getZero(@RequestParam String username)
	{
		return "zero the hero "+username;
	}

}