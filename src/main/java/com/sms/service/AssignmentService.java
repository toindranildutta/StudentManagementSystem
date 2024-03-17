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
	private AssignmentRespository assignmentRepository;
	
	
	public List<Assignment> getAllAssignment() {
		return assignmentRepository.findAll();
	}
	
	public Optional<Assignment> getAssignment(String id) {
		return assignmentRepository.findById(id);
	}
	
	public void addAssignment(Assignment assignment) {
		assignmentRepository.save(assignment);
	}
	
	public void updateAssignment(Assignment assignment) {
		assignmentRepository.save(assignment);
	}
	
	public void deleteAssignment(String id) {
		assignmentRepository.deleteById(id);
	}
}
