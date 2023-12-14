package com.sapient.main;

import com.sapient.dao.LoginDAO;
import com.sapient.service.LoginService;
import com.sapient.service.contracts.ILoginService;

public class App {
	public static void main(String[] args) {
		ILoginService ls = new LoginService(new LoginDAO()); 
	}
}
