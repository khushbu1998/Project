package com.cts.khushbu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.khushbu.model.UserLogin;
import com.cts.khushbu.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@CrossOrigin
@Controller
public class LoginController {
	
	
	 @Autowired 
	 LoginService service;
	 
	
	@PostMapping
	@RequestMapping(value="/login", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public UserLogin getLogin(@RequestBody UserLogin userLogin) {
		UserLogin validate= service.validate(userLogin);
		
		System.out.println(validate);
		return(validate);
		
	}

}