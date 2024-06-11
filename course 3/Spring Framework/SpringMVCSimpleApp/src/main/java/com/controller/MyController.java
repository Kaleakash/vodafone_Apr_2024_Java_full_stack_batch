package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller    // like servlet or controller layer specific class 
public class MyController {

	// hello is url mapping like map our request 
	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public ModelAndView sayHello() {
		// coding 
		System.out.println("I Came here!");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display1.jsp");
		return mav;
	}
}
