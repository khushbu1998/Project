package com.cts.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.registration.model.UserLogin;
import com.cts.registration.repository.UserLoginRepository;


@Service
public class RegistrationService {

	@Autowired
	UserLoginRepository repo;
	
	
	public UserLogin addNew(UserLogin newUser) {
		
		UserLogin user = repo.save(newUser);
		/*
		 * if(newCustomer !=null) return true; else return false;
		 */
		return user;
		// TODO Auto-generated method stub
	}

}
