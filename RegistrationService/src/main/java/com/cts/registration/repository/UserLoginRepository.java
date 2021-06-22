package com.cts.registration.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cts.registration.model.UserLogin;




@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin,Long> {
	}



