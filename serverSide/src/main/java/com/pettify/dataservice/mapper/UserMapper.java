package com.pettify.dataservice.mapper;

import java.util.List;

import com.pettify.dataservice.controller.dto.UserDto;
import com.pettify.dataservice.model.User;

public interface UserMapper {
	
	User toUser(UserDto userDto);
	
	UserDto toUserDto(User user);
	
	List<User> toUserList(List<UserDto> userDto);
	
	List<UserDto> toUserDtoList(List<User> users);
}
