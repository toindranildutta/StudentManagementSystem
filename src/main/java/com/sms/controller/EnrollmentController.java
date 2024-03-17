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
import com.sms.model.Enrollment;
import com.sms.model.Student;
import com.sms.service.EnrollmentService;

@RestController
public class EnrollmentController {
	
	@Autowired
	private EnrollmentService enrollmentService;
	
	@GetMapping("/enrollments")
	public List<Enrollment> getAllEnrollment(){
		return enrollmentService.getAllEnrollment();
	}
	
	@GetMapping("/enrollment/{id}")
	public Optional<Enrollment> getEnrollment(@PathVariable String id) {
		return enrollmentService.getEnrollment(id);
	}
	
	@PostMapping("/enrollment/{studentid}/{courseid}")
	public void addEnrollment(@RequestBody Enrollment enrollment, @PathVariable String studentid, @PathVariable String courseid) {
		enrollment.setStudent(new Student(studentid, "", "", "", ""));
		enrollment.setCourse(new Course(courseid, "", ""));
		enrollmentService.addEnrollment(enrollment);
	}
	
	@PutMapping("/enrollment/{studentid}/{courseid}")
	public void updateEnrollment(@RequestBody Enrollment enrollment, @PathVariable String studentid, @PathVariable String courseid) {
		enrollment.setStudent(new Student(studentid, "", "", "", ""));
		enrollment.setCourse(new Course(courseid, "", ""));
		enrollmentService.updateEnrollment(enrollment);
	}
	
	@DeleteMapping("/enrollment/{id}")
	public void deleteEnrollment(@PathVariable String id) {
		enrollmentService.deleteEnrollment(id);
	}
}
