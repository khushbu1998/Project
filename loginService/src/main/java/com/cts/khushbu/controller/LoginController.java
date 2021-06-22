package com.cts.khushbu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.khushbu.model.UserLogin;
import com.cts.khushbu.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@CrossOrigin
@RestController
public class LoginController {
	
	
	 @Autowired 
	 LoginService service;
	 
	 public UserLogin validate;
	 
	
	@PostMapping
	@RequestMapping(value="/login", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public UserLogin getLogin(@RequestBody UserLogin userLogin) {
		validate= service.validate(userLogin);
		
		System.out.println(validate);
		return validate;
		
	}
	
	/*
	 * @GetMapping
	 * 
	 * @RequestMapping(value="/welcome", produces=MediaType.APPLICATION_JSON_VALUE)
	 * public UserLogin getLogin2() { return (validate);
	 * 
	 * }
	 */
	

}
