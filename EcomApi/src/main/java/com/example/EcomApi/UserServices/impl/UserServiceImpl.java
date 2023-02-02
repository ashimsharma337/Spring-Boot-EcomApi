package com.example.EcomApi.UserServices.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EcomApi.Entities.User;
import com.example.EcomApi.Payloads.UserDto;
import com.example.EcomApi.Repositories.UserRepo;
import com.example.EcomApi.UserServices.UserService;

public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepo userRepo;
	
	
	@Override
	public UserDto createUser(UserDto userDto) {
        
		User user = this.dtoToUser(userDto);
		
		User savedUser = this.userRepo.save(user);

		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllusers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	
	
	//without model mapper
	public User dtoToUser(UserDto userDto) 
	{
       //creating user object
		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAddress(userDto.getPassword());
		
		return user;
		
    }
	
	public UserDto userToDto(User user)
	{
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAddress(user.getAddress());
		
		return userDto;
		
	}
}
