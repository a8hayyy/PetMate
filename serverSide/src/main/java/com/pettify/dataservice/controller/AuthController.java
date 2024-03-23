package com.pettify.dataservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pettify.dataservice.mapper.UserCredMapper;
import com.pettify.dataservice.mapper.UserMapper;
import com.pettify.dataservice.model.UserCred;
import com.pettify.dataservice.service.UserCredService;
import com.pettify.dataservice.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pettifyDB/api/auth")
public class AuthController {
	
	private final UserCredService userCredService;
	private final UserCredMapper userCredMapper;
	
	@Autowired
	public AuthController(UserCredService userCredService, UserCredMapper userCredMapper) {
        this.userCredMapper = userCredMapper;
        this.userCredService=userCredService;
    }
	
	@GetMapping("/")
	public RequestEntity<List<UserCred>> getAllUserCred(){
		return RequestEntity.ok(userCredMapper.toUserCredList(userCredService.getAllUserCred()));
	}
}
