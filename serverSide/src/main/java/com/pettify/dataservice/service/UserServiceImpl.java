package com.pettify.dataservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pettify.dataservice.model.User;
import com.pettify.dataservice.model.UserCred;
import com.pettify.dataservice.repository.UserCredRepo;
import com.pettify.dataservice.repository.UserRepo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private final UserRepo userRepo;
	
	public UserServiceImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean isUniqueEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isUniqueNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
