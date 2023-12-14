package com.sapient.service;

import com.sapient.beans.Login;
import com.sapient.dao.LoginDAOMongoDB;
import com.sapient.exception.LoginFailedException;
import com.sapient.service.contracts.ILoginService;

public class LoginService implements ILoginService {
	
	private LoginDAOMongoDB loginDao;
	
	public LoginService(LoginDAOMongoDB loginDao) {
		this.loginDao = loginDao;
	}
	
	@Override
	public boolean loginCheck(Login login) throws LoginFailedException{
		throw new LoginFailedException("Sorry Login Failed Please Check Credentils"); 
	}
}
