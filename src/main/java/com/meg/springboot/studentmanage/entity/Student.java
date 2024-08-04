package com.meg.springboot.studentmanage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="firstname",nullable=false)
	private  String firstname;
	@Column(name="second name",nullable=false)
	private  String secondname;
	@Column(name="email",nullable=false)
	private  String email;
	
	
	
	
	
	
	
	public Student() {
		super();
	}





	public long getId() {
		return id;
	}





	public void setId(long id) {
		this.id = id;
	}





	public String getFirstname() {
		return firstname;
	}





	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}





	public String getSecondname() {
		return secondname;
	}





	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Student( String firstname, String secondname, String email) {
		super();
		
		this.firstname = firstname;
		this.secondname = secondname;
		this.email = email;
	}
	
	
	
	
	

}
