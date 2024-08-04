package com.meg.springboot.studentmanage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.meg.springboot.studentmanage.entity.Student;
import com.meg.springboot.studentmanage.repository.StudentRepository;

@SpringBootApplication
public class StudentmanagementsystemApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		
		/*Student student1 = new Student("Madhu","challa","cmadhukiran@24");
		
		studentRepository.save(student1);
		// TODO Auto-generated method stub
		

		Student student2 = new Student("Madhu1","challa1","cmadhukiran@2411");
		
		studentRepository.save(student2);
		

		Student student3 = new Student("Madhu3","challa3","cmadhukiran@243");
		
		studentRepository.save(student3);*/
		
	}
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

}
