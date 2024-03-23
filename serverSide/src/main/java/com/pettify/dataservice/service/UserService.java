package com.pettify.dataservice.service;

import java.util.List;

import com.pettify.dataservice.model.User;

public interface UserService {
	
//	UserRepo Methods
	
	List<User> getAllUser();
	
	User getUserById(Integer id);
	
	User getUserByEmail(String email);
	
	User getUserByPhoneNumber(String phoneNumber);
	
	User saveUser(User user);
	
	void delete(User user);
	
	Boolean isUniqueEmail();
	
	Boolean isUniqueNumber();
	
}
