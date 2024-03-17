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
	private EnrollmentRespository enrollmentRepository;
	
	
	public List<Enrollment> getAllEnrollment() {
		return enrollmentRepository.findAll();
	}
	
	public Optional<Enrollment> getEnrollment(String id) {
		return enrollmentRepository.findById(id);
	}
	
	public void addEnrollment(Enrollment enrollment) {
		enrollmentRepository.save(enrollment);
	}
	
	public void updateEnrollment(Enrollment enrollment) {
		enrollmentRepository.save(enrollment);
	}
	
	public void deleteEnrollment(String id) {
		enrollmentRepository.deleteById(id);
	}
}
