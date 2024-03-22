package com.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.model.Student;
import com.sms.repository.StudentRespository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRespository studentRepository; // Autowired studentRepository object
	
	// Retrieve all students
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	// Retrieve a student by ID
	public Optional<Student> getStudent(String id) {
		return studentRepository.findById(id);
	}
	
	// Add a new student
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	// Update an existing student
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}
	
	// Delete a student by ID
	public void deleteStudent(String id) {
		studentRepository.deleteById(id);
	}
}
