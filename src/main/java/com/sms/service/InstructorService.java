package com.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.model.Instructor;
import com.sms.repository.InstructorRespository;

@Service
public class InstructorService {
	
	@Autowired
	private InstructorRespository instructorRepository;
	
	
	public List<Instructor> getAllInstructor() {
		return instructorRepository.findAll();
	}
	
	public Optional<Instructor> getInstructor(String id) {
		return instructorRepository.findById(id);
	}
	
	public void addInstructor(String id, Instructor instructor) {
		instructorRepository.save(instructor);
	}
	
	public void updateInstructor(String id, String courseid, Instructor instructor) {
		instructorRepository.save(instructor);
	}
	
	public void deleteInstructor(String id) {
		instructorRepository.deleteById(id);
	}
}
