package com.pettify.dataservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pettify.dataservice.controller.dto.UserDto;
import com.pettify.dataservice.mapper.UserCredMapper;
import com.pettify.dataservice.mapper.UserMapper;
import com.pettify.dataservice.service.UserService;


@RestController
@RequestMapping("/pettifyDB/api/users")
public class UserController {
	
	private final UserService userService;
	private final UserMapper userMapper;
	private final UserCredMapper userCredMapper;
	
	@Autowired
	public UserController(UserService userService, UserMapper userMapper, UserCredMapper userCredMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
        this.userCredMapper = userCredMapper;
    }
	
	@GetMapping("/")
	public RequestEntity<List<UserDto>> getUsers() {
		return  RequestEntity.body(UserMapper.toUserDtoList(userService.getAllUser()));
	}
	
	@GetMapping("/user/id/{id}")
	public RequestEntity<UserDto> getUserById(@PathVariable Integer id) {
		return  RequestEntity.body(UserMapper.toUserDto(userService.getUserById(id)));
	}
	
	@GetMapping("/user/email/{email}")
	public UserDto getUserByEmail(@PathVariable String email) {
		return UserMapper.toUserDto(userService.getUserByEmail(email));
	}
	
	@GetMapping("/user/phonenumber/{phonNumber}")
	public UserDto getUserByPhoneNumber(@PathVariable String phoneNumber) {
		return UserMapper.toUserDto(userService.getUserByEmail(phoneNumber));
	}
	
//	@GetMapping("/user/register")
//	public UserDto registerUser(@Valid @RequestBody UserDto userDto) {
//		
//	}
	
	
//	@Postmapping("")
	
}
