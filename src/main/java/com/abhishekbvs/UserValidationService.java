package com.abhishekbvs;

public class UserValidationService {
	
	public boolean validateUser(String user, String password) {
		if(user.equalsIgnoreCase("abhishek") && password.equals("dummy")) {
			return true;
		}
		else {
			return false;
		}
	}
}
