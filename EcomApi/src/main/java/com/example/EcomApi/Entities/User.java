package com.example.EcomApi.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="users")
@Entity
public class User {

	//Default constructor
	public User(){
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String password;
	private String address;
	
	//getters
	  public int getId(){
	     return this.id;
	  }

	  public String getName(){
	     return this.name;
	  }
	  
	  public String getEmail(){
		     return this.email;
	  }
	  
	  public String getPassword(){
		     return this.password;
	  }
	  
	  public String getAddress(){
		     return this.address;
	  }
	  
	//setters
	  public void setId(int id){
	     this.id = id;
	  }

	 public void setName(String name){
	    this.name = name;
	 }
	 
	 public void setEmail(String email){
		    this.email = email;
     }
	 
	 public void setPassword(String password){
		    this.password = password;
	 }
	 
	 public void setAddress(String address){
		    this.address = address;
	 }
	
}
