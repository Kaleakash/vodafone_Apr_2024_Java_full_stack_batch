package com.ebank.service;

import com.ebank.bean.Login;
import com.ebank.dao.LoginDao;

public class LoginService {

	LoginDao ld = new LoginDao();
	
	public String signIn(Login login) {
		StringBuffer sb = new StringBuffer(login.getPassword());
		String reversePassword  = sb.reverse().toString();
		login.setPassword(reversePassword);
		
		if(ld.singIn(login)) {
			
			if(login.getTypeofuser().equals("Manager")) {
				return "successfully login by manager";
			}else {
				return "successfully login by customer";
			}
			
		}else {
			return "failure try once again";
		}
		
	}
	
	public String signUp(Login login) {
		StringBuffer sb = new StringBuffer(login.getPassword());
		String reversePassword  = sb.reverse().toString();
		login.setPassword(reversePassword);
		if(ld.singUp(login)>0) {
			return "Account created successfully";
		}else {
			return "Account didn't create, Email id already exists";
		}
	}
}
