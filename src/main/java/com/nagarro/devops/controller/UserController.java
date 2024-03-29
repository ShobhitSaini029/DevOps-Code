package com.nagarro.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping
	public String userData() {
		System.out.println("Controller is eorking fine");
		return "Devops application is connnected.";
	}

}
