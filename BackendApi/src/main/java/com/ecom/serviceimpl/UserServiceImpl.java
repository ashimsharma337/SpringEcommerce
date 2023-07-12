package com.ecom.serviceimpl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Dao.UserDao;
import com.ecom.entities.User;
import com.ecom.services.UserService;

@Service
public class UserServiceImpl implements UserService{
    
	@Autowired
	private UserDao userDao;
	
	public UserServiceImpl() {
		
	}
	
	
	@Override 
	public List<User> getAllUsers() {
		return userDao.findAll();
	}


	
	@Override
	public User getUser (Integer userId) {
		
		return userDao.getById(userId);
	}


	@Override
	public User createUser(User user) {
        userDao.save(user);
		return user;
	}


	@Override
	public User updateUser(User user) {
		userDao.save(user);
		return user;
	}


	@Override
	public void deleteUser(Integer userId) {
		User entity = userDao.getOne(userId);
		userDao.delete(entity);
		
	}
}
