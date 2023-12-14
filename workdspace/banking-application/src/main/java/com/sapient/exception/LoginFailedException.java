package com.sapient.exception;

public class LoginFailedException extends BankingGenericException{
	
	private String message; 
	
	public LoginFailedException() {
		this.message ="Sorry Login Failed"; 
	}
	
	public LoginFailedException(String message) {
		this.message  = message; 
	}

	@Override
	public String getMessage() {
		return this.message; 
	}

	@Override
	public String toString() {
		return "LoginFailedException [message=" + message + "]";
	}
	
	
	
}
