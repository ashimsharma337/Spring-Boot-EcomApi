package com.example.EcomApi.Exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResourceNotFoundException extends RuntimeException{
    
	String resourceName;
	String fieldName;
	long fieldValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		//super because we are extending superclass RuntimeException
		super(String.format("%s not fond with %s : %l" , resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
}
