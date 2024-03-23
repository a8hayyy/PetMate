package com.pettify.dataservice.service;

import java.util.List;

import com.pettify.dataservice.model.UserCred;

public interface UserCredService {
	
//	UserCredRepo Method
	
	List<UserCred> getAllUserCred();
	
	void save(UserCred userCred);
	
	void signIn(UserCred userCred);
}
