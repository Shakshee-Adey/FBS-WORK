package com.services;

//menu card of the login system
public interface LoginValidationServices {
	
	public void createUser(String userName, String password);
	public boolean validateUser(String userName, String password);
	

}
