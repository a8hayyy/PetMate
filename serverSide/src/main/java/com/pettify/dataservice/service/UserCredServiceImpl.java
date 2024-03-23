package com.pettify.dataservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pettify.dataservice.model.UserCred;
import com.pettify.dataservice.repository.UserCredRepo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class UserCredServiceImpl implements UserCredService {
	
	
	private final UserCredRepo userCredRepo;
	
	@Autowired
	public UserCredServiceImpl(UserCredRepo userCredRepo) {
		this.userCredRepo = userCredRepo;
	}

	@Override
	public List<UserCred> getAllUserCred() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(UserCred userCred) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void signIn(UserCred userCred) {
		
	}
}
