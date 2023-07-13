package com.ecom.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	// get user by Id
	@GetMapping("/users/{userId}")
	public Optional<User> getUserById(@PathVariable String userId) {
		
		return this.userService.getUserById(Integer.parseInt(userId));
	}
	
	// create user
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		
		return this.userService.createUser(user);
	}
	
	// update user	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	}
	
	// delete user 
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId) {
		try {
			this.userService.deleteUser(Integer.parseInt(userId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
