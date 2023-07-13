package com.ecom.services;

import java.util.List;
import java.util.Optional;

import com.ecom.entities.User;


public interface UserService {
   
    User createUser(User user);
	
    User updateUser(User user);
	
 	Optional<User> getUserById(Integer userId);

	List<User> getAllUsers();

    void deleteUser(Integer userId);
	
}
