package com.sms.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.model.Course;
import com.sms.model.Instructor;
import com.sms.service.InstructorService;

@RestController
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;
	@GetMapping("/instructors")
	public List<Instructor> getAllInstructors(){
		return instructorService.getAllInstructor();
	}
	
	@GetMapping("/courses/{courseid}/instructor/{id}")
	public Optional<Instructor> getInstructor(@PathVariable String id) {
		return instructorService.getInstructor(id);
	}
	
	@PostMapping("/courses/{id}/instructor")
	public void addInstructor(@RequestBody Instructor instructor, @PathVariable String id) {
		instructor.setCourse(new Course(id, "", ""));
		instructorService.addInstructor(id, instructor);
	}
	
	@PutMapping("/courses/{courseid}/instructors/{id}")
	public void updateInstructor(@RequestBody Instructor instructor, @PathVariable String courseid, @PathVariable String id) {
		instructor.setCourse(new Course(courseid, "", ""));
		instructorService.updateInstructor(id, courseid, instructor);
	}
	
	@DeleteMapping("/courses/{courseid}/instructor/{id}")
	public void deleteCourse(@PathVariable String id) {
		instructorService.deleteInstructor(id);
	}
}
