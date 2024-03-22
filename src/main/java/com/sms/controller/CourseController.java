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

import com.sms.model.Course;
import com.sms.service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class CourseController {
	
	@Autowired
	private CourseService courseService; // Autowired courseService object
	
	@GetMapping("/courses") // Retrieve all courses
	public List<Course> getAllCourses(){
		return courseService.getAllCourse();
	}
	
	@GetMapping("/courses/{id}") // Retrieve a single course by ID
	public Optional<Course> getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@PostMapping("/courses") // Create a new course
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@PutMapping("/courses/edit/{id}") // Update an existing course
	public void updateCourse(@RequestBody Course course) {
		courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{id}") // Delete a course by ID
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
