package com.example.EcomApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EcomApi.Entities.User;


public interface UserRepo extends JpaRepository<User, Integer>{

}
