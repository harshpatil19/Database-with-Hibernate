package com.app.dao;


import java.time.LocalDate;
import java.util.List;

import com.app.entities.Role;
import com.app.entities.User;

public interface UserDao {
//add a method for user sign up
	String registerUser(User user);
	//add a method to get user details by it's id
	User getUserDetails(Long userId);
	//add a method to return list of all users
	List<User> getAllUsers();
	//add a method to return list of usersby dob and role
	List<User> getUserByDobAndRole(LocalDate start, LocalDate end, Role role);
	//add a method to return list of user by email and password
	User getEmailandPassword(String email, String password);
	//add method to return the updated password
	String UpdatePassword(String email, String oldPwd, String newPwd);
}
