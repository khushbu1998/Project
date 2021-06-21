package com.cts.khushbu.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cts.khushbu.model.UserLogin;




@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin,Long> {
	}



