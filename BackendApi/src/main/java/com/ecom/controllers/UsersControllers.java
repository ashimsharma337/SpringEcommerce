package com.ecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entities.User;
import com.ecom.services.UserService;

@RestController
public class UsersControllers {
    
	@Autowired
	private UserService userService;
	
	
	// get all users 
	@GetMapping("/users")
	public List<User> getAllUsers() {
		
		return this.userService.getAllUsers();
	}
}
