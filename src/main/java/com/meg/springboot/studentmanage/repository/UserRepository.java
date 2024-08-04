package com.meg.springboot.studentmanage.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.meg.springboot.studentmanage.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

	
	
	
	
	
	

	
	
}
