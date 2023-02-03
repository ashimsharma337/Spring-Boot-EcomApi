package com.example.EcomApi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EcomApi.Payloads.UserDto;
import com.example.EcomApi.UserServices.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
       
    @Autowired
	private UserService userService;
    
	//Post-create user=
    @PostMapping
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto)
    {
    	UserDto createUserDto = this.userService.createUser(userDto);
    	return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
    }
	//Put-update user
	
	//Delete-delete user
	
	//Get-user
}
