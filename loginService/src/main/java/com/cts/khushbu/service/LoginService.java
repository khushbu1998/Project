package com.cts.khushbu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.khushbu.model.UserLogin;
import com.cts.khushbu.repository.UserLoginRepository;


@Service
public class LoginService {
	
	@Autowired
	UserLoginRepository repo;
	
	public UserLogin validate(UserLogin userLogin) {

		String email= userLogin.getEmail();
		String password=userLogin.getPassword();
		System.out.println(email);
		System.out.println(password);
		List<UserLogin> data=repo.findAll();
		System.out.println("Passed this line");
		for(UserLogin valid: data) {
			if((valid.getEmail()).equalsIgnoreCase(email)) 
			{
				System.out.println("Confirm password: "+valid.getConfirmPassword());
				if((valid.getPassword()).equalsIgnoreCase(password)) {
					
					System.out.println(valid.getFirstName());
					System.out.println(valid.getLastName());
					return valid;
				}	
		}}
		
		return userLogin;
	
	}
}
