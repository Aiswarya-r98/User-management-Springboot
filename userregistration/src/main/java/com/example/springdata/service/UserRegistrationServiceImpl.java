package com.example.springdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdata.model.User;
import com.example.springdata.repository.UserRepository;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRepository userRepository; 
	
	
	@Override
	public List<User> get() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public void save(User user) {
		if(checkIfUserAlreadyExists(user)) {
			userRepository.save(user);
			System.out.println("New User Created");
		} else {
			System.out.println("UserID already exist");
		}
	}
	
	private boolean checkIfUserAlreadyExists(User user) {
		for(User userInDB:userRepository.findAll()) {
			if(user.getUserID().equals(userInDB.getUserID())) return false;
		}
		return true;
	}
}
