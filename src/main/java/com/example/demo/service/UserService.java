package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
@Service
public class UserService implements UserServiceImpl {
    @Autowired
	UserRepo repo;
    
  
	@Override
	public void registerUser(User user) {
		repo.save(user);

	}
	

}
