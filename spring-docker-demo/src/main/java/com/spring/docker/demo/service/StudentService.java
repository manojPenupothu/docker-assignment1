package com.spring.docker.demo.service;

import java.util.List;

import com.spring.docker.demo.entity.Student;

public interface StudentService {

	
	List<Student> fetchAllAStudents();
	
	Student persistStudent(Student student);
}
