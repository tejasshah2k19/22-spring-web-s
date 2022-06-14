package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//4
@Controller
public class SessionController {

	// signup
	//view 
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String  signup() {
		System.out.println("signup()");
		return "Signup";//jsp
	}
	//logic
	@RequestMapping(value="/saveuser",method=RequestMethod.POST)
	public String saveUser() {
		return "";
	}
	
	
	

	// register
	//view 
	//logic 

	// forgetpassword
	//view
	//logic 
}

//session --> loing , register , forgetpassword 

//advjava -> LoginServlet RegisterServlet ForgetPAsswordServlet 
