package com.spring.docker.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.docker.demo.entity.Student;
import com.spring.docker.demo.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		return ResponseEntity.ok(service.fetchAllAStudents());
	}
	
	
	@PostMapping("/")
	public ResponseEntity<Student> persistStudent(@RequestBody Student student)
	{
		Student stuFromDb=service.persistStudent(student);
		return new ResponseEntity<Student>(stuFromDb,HttpStatus.CREATED);
	}
}
