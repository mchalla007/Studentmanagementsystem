package com.meg.springboot.studentmanage.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.meg.springboot.studentmanage.entity.Student;
import com.meg.springboot.studentmanage.repository.StudentRepository;
import com.meg.springboot.studentmanage.service.StudentService;


@Service
public class StudentServiceimpl  implements StudentService {

	
	private StudentRepository studentRepository;
	
	
	 public StudentServiceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}





    @Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return  studentRepository.findAll();
	}





	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return  studentRepository.save(student);
	}





	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}





	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}





	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		
		studentRepository.deleteById(id);
		
	}

}
