package com.meg.springboot.studentmanage.service;

import java.util.List;



import com.meg.springboot.studentmanage.entity.Student;



public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	
	Student getStudentById(Long id);
	
	void deleteStudentById(Long id);
	

}
