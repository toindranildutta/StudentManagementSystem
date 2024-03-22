package com.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.model.Assignment;
import com.sms.repository.AssignmentRespository;

@Service
public class AssignmentService {
	
	@Autowired
	private AssignmentRespository assignmentRepository; // Autowired assignmentRepository object
	
	// Retrieve all assignments
	public List<Assignment> getAllAssignment() {
		return assignmentRepository.findAll();
	}
	
	// Retrieve an assignment by ID
	public Optional<Assignment> getAssignment(String id) {
		return assignmentRepository.findById(id);
	}
	
	// Add a new assignment
	public void addAssignment(Assignment assignment) {
		assignmentRepository.save(assignment);
	}
	
	// Update an existing assignment
	public void updateAssignment(Assignment assignment) {
		assignmentRepository.save(assignment);
	}
	
	// Delete an assignment by ID
	public void deleteAssignment(String id) {
		assignmentRepository.deleteById(id);
	}
}
