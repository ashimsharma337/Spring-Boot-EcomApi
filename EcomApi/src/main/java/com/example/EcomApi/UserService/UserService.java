package com.example.EcomApi.UserService;

import java.util.List;

import com.example.EcomApi.Payloads.UserDto;

public interface UserService {
      
	//create user
	UserDto createUser(UserDto user);
	//update user
	UserDto updateUser(UserDto user, Integer userId);
	//get user by id
	UserDto getUserById(Integer userId);
	//get all users
	List<UserDto> getAllusers();
	//delete user
	void deleteUser(Integer userId);
	
	
}
