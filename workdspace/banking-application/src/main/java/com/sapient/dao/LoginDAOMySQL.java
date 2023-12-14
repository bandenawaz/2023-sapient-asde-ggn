package com.sapient.dao;

import com.sapient.beans.Login;
import com.sapient.dao.contracts.ILoginDao;
import com.sapient.exception.LoginFailedException;

public class LoginDAOMySQL implements ILoginDao {

	@Override
	public boolean loginCheck(Login login) throws LoginFailedException {
		// TODO Auto-generated method stub
		return false;
	}

}
