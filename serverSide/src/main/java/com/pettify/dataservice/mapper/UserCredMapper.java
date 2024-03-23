package com.pettify.dataservice.mapper;

import java.util.List;

import com.pettify.dataservice.controller.dto.UserCredDto;
import com.pettify.dataservice.model.User;
import com.pettify.dataservice.model.UserCred;

public interface UserCredMapper {
		
	UserCred toUserCred (UserCredDto userCredDto, User user);
	
	UserCredDto toUserCredDto (UserCred userCred, User user);
	
	List<UserCred> toUserCredList(List<UserCredDto> userCredDtoList, User user);
	
}
