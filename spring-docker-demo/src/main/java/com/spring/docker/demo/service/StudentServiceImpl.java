package com.spring.docker.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.docker.demo.entity.Student;
import com.spring.docker.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public List<Student> fetchAllAStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student persistStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

}
