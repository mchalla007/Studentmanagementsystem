package com.meg.springboot.studentmanage.service;

import java.util.List;

import com.meg.springboot.studentmanage.entity.User;

public interface UserService {
	
	List<User> getallUsers();
	
	 User CreateUser(User user);
	 
	 Void DeleteUser(long id);
	 
	 User UpdateUser(User user);
	 
	 User findByEmail(String email);
	 
	 
	 
	  
	  
	  

}
