package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.Login;

@SpringBootTest						// spring boot testing annotation 
class LoginServiceTest {

	@Autowired
	LoginService loginService;
	
	@Test
	@Disabled
	void testSignIn() {
		
	}

	@Test
	void testSignUp() {
	Login ll = new Login();
	ll.setEmailid("akash@gmail.com");
	ll.setPassword("123");
	String result = loginService.signUp(ll);
	//assertEquals("account created succesfully", result);
	assertEquals("Emailid is must be unique", result);
	}

}
