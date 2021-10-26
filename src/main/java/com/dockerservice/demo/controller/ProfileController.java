package com.dockerservice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ProfileController {
	
	@GetMapping("/api")
	public String getProfile() {
		return "Profile Information"; 
	}

}
