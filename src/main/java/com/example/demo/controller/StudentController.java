package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/test")
	public ResponseEntity<String> testClass(){
		return new ResponseEntity<>("Hello World",HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student saved = studentRepository.save(student);
		return new ResponseEntity<>(saved,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> findAllStudents(){
		List<Student> list = studentRepository.findAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}

}
