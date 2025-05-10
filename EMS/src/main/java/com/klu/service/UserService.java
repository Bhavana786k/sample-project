package com.klu.service;

import com.klu.model.User;
import com.klu.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepo UR;
	
	// Create user
	public User createUser(User u) {
		return UR.save(u);
	}

}
