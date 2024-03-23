package com.pettify.dataservice.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pettify.dataservice.controller.dto.UserDto;
import com.pettify.dataservice.model.User;

@Service
public class UserMapperImpl implements UserMapper {
	
	@Override
	public User toUser(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setUserName(userDto.getUserName());
		user.setEmail(userDto.getEmail());
		user.setPhoneNumber(userDto.getPhoneNumber());
		user.setPincode(userDto.getPincode());
		
		return user;
	}
	
	@Override
	public UserDto toUserDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setUserName(user.getUserName());
		userDto.setEmail(user.getEmail());
		userDto.setPhoneNumber(user.getPhoneNumber());
		userDto.setPincode(user.getPincode());
		
		return userDto;
	}

	@Override
	public List<User> toUserList(List<UserDto> userDto) {
		List<User> userList = new ArrayList<User>();
		for(UserDto userdto : userDto) {
			userList.add(toUser(userdto));
		}
		return userList;
	}

	@Override
	public List<UserDto> toUserDtoList(List<User> users) {
		List<UserDto> userDtoList = new ArrayList<UserDto>();
		for(User user : users) {
			userDtoList.add(toUserDto(user));
		}
		return userDtoList;
	}
	
}
