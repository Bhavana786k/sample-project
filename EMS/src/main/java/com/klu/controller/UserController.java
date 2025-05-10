package com.klu.controller;

import com.klu.model.User;
import com.klu.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService US;
	
	// HTTP Request for creating user
	@PostMapping("/add")
	public String createUser(@RequestBody User u) {
		US.createUser(u);
		return "User registered successfully";
	}

}
