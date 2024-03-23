package com.pettify.dataservice.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pettify.dataservice.controller.dto.UserCredDto;
import com.pettify.dataservice.model.User;
import com.pettify.dataservice.model.UserCred;

@Service
public class UserCredMapperImpl implements UserCredMapper {
	
	private final UserCredMapper userCredMapper;
	
	@Autowired
	public UserCredMapperImpl(UserCredMapper userCredMapper) {
		this.userCredMapper = userCredMapper;
	}
	
	@Override
	public UserCred toUserCred (UserCredDto userCredDto, User user) {
		
		UserCred userCred = new UserCred();
		
		userCred.setId(userCredDto.getId());
		userCred.setUserEmail(user);
		userCred.setPassword(userCredDto.getPassword());
		
		return userCred;
	}
	
	@Override
	public UserCredDto toUserCredDto (UserCred userCred, User user) {
		
		UserCredDto userCredDto = new UserCredDto();
		
		userCredDto.setId(userCred.getId());
		userCredDto.setUserEmail(user);
		userCredDto.setPassword(userCred.getPassword());
	}

	@Override
	public List<UserCred> toUserCredList(List<UserCredDto> userCredDtoList, User user) {
		List<UserCred> userCredList = new ArrayList<UserCred>();
		for(UserCredDto userCredDto : userCredDtoList) {
			userCredList.add(userCredMapper.toUserCred(userCredDto,user));
		}
		return userCredList;
	}
}
