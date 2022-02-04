package com.example.springdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdata.model.User;
import com.example.springdata.service.UserRegistrationService;


@RestController
@RequestMapping("/tailorShop")
public class UserRegistrationController {
	
	@Autowired
	private UserRegistrationService userRegistrationService;
	
	@PostMapping("/employee")
	public User save(@RequestBody User user) {
		userRegistrationService.save(user);
		return user;
	}
	
	@GetMapping("/employee")
	public List<User> get(){
		return userRegistrationService.get();
	}
	
}
