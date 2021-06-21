package com.cts.khushbu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="user")
@Data
public class UserLogin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="confirmPassword")
	private String confirmPassword;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="securityQuestion")
	private String securityQuestion;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	

}
