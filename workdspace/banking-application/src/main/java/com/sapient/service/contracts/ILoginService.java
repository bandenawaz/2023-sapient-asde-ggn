package com.sapient.service.contracts;

import com.sapient.beans.Login;
import com.sapient.exception.LoginFailedException;

public interface ILoginService {

	boolean loginCheck(Login login) throws LoginFailedException;

}