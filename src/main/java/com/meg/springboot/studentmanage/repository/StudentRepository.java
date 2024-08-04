package com.meg.springboot.studentmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meg.springboot.studentmanage.entity.Student;



public interface StudentRepository  extends JpaRepository<Student, Long>{

}
