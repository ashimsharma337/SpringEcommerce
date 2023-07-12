package com.ecom.services;

import java.util.List;

import com.ecom.entities.User;


public interface UserService {
   
    User createUser(User user);
	
    User updateUser(User user);
	
 	User getUser(Integer userId);

	List<User> getAllUsers();

    void deleteUser(Integer userId);
	
}
