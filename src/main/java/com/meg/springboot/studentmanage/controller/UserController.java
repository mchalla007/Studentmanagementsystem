package com.meg.springboot.studentmanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.meg.springboot.studentmanage.entity.User;
import com.meg.springboot.studentmanage.service.UserService;

@Controller
@RequestMapping("/us")
public class UserController 
{
	
	@Autowired
	public UserService userservice;
	
	
	@PostMapping("/valid")
	public String ValidUser(@RequestParam("email")String email,
			@RequestParam("password") String password) {
		
		User user=userservice.findByEmail(email);
		
		String dbpassword =user.getPassword();
		
		if(password.equals(dbpassword)) {
			
			
			
			
			
			return "students";
			
			
			
			}
		
		else {
			return "wrong";
		}
	}
	
	
	@GetMapping("/add")
	public String CreateUser(@ModelAttribute User user) {
		
		
		userservice.CreateUser(user);
		
		
		
		return "User";
	}
	
	@GetMapping("/login")
	public String login() {
		return "UserLogin";
	}
	

	
	
	
	
	
}	
		
		
	
	
	

