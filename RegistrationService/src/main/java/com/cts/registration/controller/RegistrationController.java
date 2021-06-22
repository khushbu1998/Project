package com.cts.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.registration.model.UserLogin;
import com.cts.registration.service.RegistrationService;

@CrossOrigin
@RestController
public class RegistrationController {
	
	@Autowired
	RegistrationService service;
	
	@PostMapping
	@RequestMapping(value="/new", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public UserLogin addUser(@RequestBody UserLogin newUser) {
		//customerList.add(newCustomer);
		UserLogin saved=service.addNew(newUser);
		//if(!saved)
		//	throw new CustomerNotCreatedException("could not create customer");
		System.out.println(saved);
		return saved; 
		//return ResponseEntity.status(HttpStatus.CREATED).body(true);
	}
	
	

}
