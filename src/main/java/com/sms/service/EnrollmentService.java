package com.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.model.Enrollment;
import com.sms.repository.EnrollmentRespository;

@Service
public class EnrollmentService {
	
	@Autowired
	private EnrollmentRespository enrollmentRepository; // Autowired enrollmentRepository object
	
	// Retrieve all enrollments
	public List<Enrollment> getAllEnrollment() {
		return enrollmentRepository.findAll();
	}
	
	// Retrieve an enrollment by ID
	public Optional<Enrollment> getEnrollment(String id) {
		return enrollmentRepository.findById(id);
	}
	
	// Add a new enrollment
	public void addEnrollment(Enrollment enrollment) {
		enrollmentRepository.save(enrollment);
	}
	
	// Update an existing enrollment
	public void updateEnrollment(Enrollment enrollment) {
		enrollmentRepository.save(enrollment);
	}
	
	// Delete an enrollment by ID
	public void deleteEnrollment(String id) {
		enrollmentRepository.deleteById(id);
	}
}
