package com.sapient.dao.contracts;

import com.sapient.beans.Login;
import com.sapient.exception.LoginFailedException;

public interface ILoginDao {

	boolean loginCheck(Login login) throws LoginFailedException;

}
