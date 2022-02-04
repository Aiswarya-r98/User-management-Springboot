package com.example.springdata.service;

import java.util.List;

import com.example.springdata.model.User;

public interface UserRegistrationService {
	
	List<User> get();
	
	void save(User user);
}
