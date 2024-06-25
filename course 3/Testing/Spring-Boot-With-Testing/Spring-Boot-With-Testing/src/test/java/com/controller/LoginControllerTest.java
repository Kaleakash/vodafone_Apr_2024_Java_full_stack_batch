package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.Login;
import com.service.LoginService;

@ExtendWith(MockitoExtension.class)		// it help to create mock or fake object. 
@SpringBootTest
class LoginControllerTest {

	
	@Mock
	LoginService loginService;		// mock for service layer 
	
	@InjectMocks
	LoginController loginController;		// inject that mock in dao layer 
	
	@Test
	@Disabled
	void testSignIn() {
		
	}
	@Test
	void testSignUp() {
		Login ll = new Login();
		
		ll.setEmailid("ravi@gmail.com");
		ll.setPassword("123");
		// fake result 
		Mockito.when(loginService.signUp(ll)).thenReturn("failure");		// fake information ready 
		
		// testing 
		String result = loginController.signUp(ll);
		assertEquals("failure", result);
		
	}

}
