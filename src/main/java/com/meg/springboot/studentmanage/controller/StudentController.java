package com.meg.springboot.studentmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.meg.springboot.studentmanage.entity.Student;
import com.meg.springboot.studentmanage.service.StudentService;

@Controller
public class StudentController {
	
	
	
	private StudentService studentservice;

	public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	@GetMapping("/student")
	public String listStudents(Model model) {
		
		model.addAttribute("students",studentservice.getAllStudents());
		
		return "students";
		
		
	}
	@GetMapping("/student/new")
	public String createStudentForm(Model model) {
		
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	
	
	
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
	studentservice.saveStudent(student);
	return "redirect:/student";
		
	}
	
	@GetMapping("/student/edit/{id}")
	public String editStudentForm(@PathVariable long id, Model model) {
		
		model.addAttribute("student", studentservice.getStudentById(id));
		
		return "edit_student";
		
		
		
	}

	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) 
	{
		
		//grt std by id
		
		Student existingStudent = studentservice.getStudentById(id);
		
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setId(id);
		existingStudent.setSecondname(student.getSecondname());
		existingStudent.setEmail(student.getEmail());
		
		//save and update
		
		
		studentservice.updateStudent(existingStudent);
		
		return "redirect:/student";
		
		
	}
	
	// to delete
	
	
	@GetMapping("student/{id}")
	
	public String deleteStudent(@PathVariable long id) {
		
		
		
		studentservice.deleteStudentById(id);
		
		return "redirect:/student";
	}
	
	
	

}
