package com.example.springdata.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "users")
public class User {
	
	@Id @GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String gender;
	private Long contactNo;
	private String email;
	private UserCategory category;
	private String userID;
	private String password;
	
	public User() {
		
	}
	public User(Integer id, String firstName, String lastName, LocalDate dob, String gender, Long contactNo,
			String email, UserCategory category, String userID, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.contactNo = contactNo;
		this.email = email;
		this.category = category;
		this.userID = userID;
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserCategory getCategory() {
		return category;
	}
	public void setCategory(UserCategory category) {
		this.category = category;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}
