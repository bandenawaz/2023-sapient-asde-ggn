package com.sapient.main;

import com.sapient.beans.Login;
import com.sapient.dao.LoginDAOMongoDB;
import com.sapient.dao.LoginDAOMySQL;
import com.sapient.dao.contracts.ILoginDao;
import com.sapient.exception.BankingGenericException;
import com.sapient.exception.LoginFailedException;
import com.sapient.service.LoginService;
import com.sapient.service.contracts.ILoginService;

public class App {
	
	public static void loginCheck(ILoginDao loginDAO, Login login) throws LoginFailedException {
		loginDAO.loginCheck(login); 
	}
	
	
	public static void main(String[] args) throws BankingGenericException{
//		ILoginService ls = new LoginService(new LoginDAO());
		
		
		Login login = new Login("Soumya", "abcde");

		ILoginDao ld = new LoginDAOMongoDB(); 
		loginCheck(new LoginDAOMongoDB(), login );


		ld = new LoginDAOMongoDB(); 
		loginCheck(new LoginDAOMySQL(), login );
		
	}
}
