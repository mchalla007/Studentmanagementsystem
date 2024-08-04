package com.meg.springboot.studentmanage.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meg.springboot.studentmanage.entity.User;
import com.meg.springboot.studentmanage.repository.UserRepository;
import com.meg.springboot.studentmanage.service.UserService;


@Service
public class UserServiceImpl  implements UserService {
	
	@Autowired
	public UserRepository repo;

	@Override
	public List<User> getallUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User CreateUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public Void DeleteUser(long id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		 return null;
	}

	@Override
	public User UpdateUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	}

	

	


	
	
}
