package com.sms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.model.Student;
import com.sms.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/students/{id}")
	public Optional<Student> getStudent(@PathVariable String id) {
		return studentService.getStudent(id);
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@PutMapping("/students/edit/{id}")
	public void updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
}
