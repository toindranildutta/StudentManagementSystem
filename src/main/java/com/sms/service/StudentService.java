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
	private StudentRespository studentRepository;
	
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	public Optional<Student> getStudent(String id) {
		return studentRepository.findById(id);
	}
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(String id) {
		studentRepository.deleteById(id);
	}
}
