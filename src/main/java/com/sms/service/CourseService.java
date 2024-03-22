package com.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.model.Course;
import com.sms.repository.CourseRespository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRespository courseRepository; // Autowired courseRepository object
	
	// Retrieve all courses
	public List<Course> getAllCourse() {
		return courseRepository.findAll();
	}
	
	// Retrieve a course by ID
	public Optional<Course> getCourse(String id) {
		return courseRepository.findById(id);
	}
	
	// Add a new course
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	// Update an existing course
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	
	// Delete a course by ID
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
