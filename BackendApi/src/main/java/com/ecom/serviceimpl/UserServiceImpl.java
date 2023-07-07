package com.ecom.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.entities.User;
import com.ecom.services.UserService;

@Service
public class UserServiceImpl implements UserService{
    
	List<User> list;
	
	public UserServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new User(1, "ashim", "ashim@test.com", "ashim123"));
		list.add(new User(2, "john", "john@test.com", "john123"));
	}
	
	
	@Override 
	public List<User> getAllUsers() {
		return list;
	}
}
