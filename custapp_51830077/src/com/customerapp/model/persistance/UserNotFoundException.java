package com.customerapp.model.persistance;

public class UserNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -5396402744673958661L;
public UserNotFoundException(String message) {
	super(message);
	
}
}
