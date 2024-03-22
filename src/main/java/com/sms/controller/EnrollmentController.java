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
import com.sms.model.Enrollment;
import com.sms.model.Student;
import com.sms.service.EnrollmentService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class EnrollmentController {					
    
    @Autowired
    private EnrollmentService enrollmentService; // Autowired enrollmentService object
    
    // Retrieve all enrollments
    @GetMapping("/enrollments")
    public List<Enrollment> getAllEnrollment(){
        return enrollmentService.getAllEnrollment();
    }
    
    // Retrieve a single enrollment by ID
    @GetMapping("/enrollments/{id}")
    public Optional<Enrollment> getEnrollment(@PathVariable String id) {
        return enrollmentService.getEnrollment(id);
    }
    
    // Add a new enrollment for a student in a course
    @PostMapping("/enrollment/{studentid}/{courseid}")
    public void addEnrollment(@RequestBody Enrollment enrollment, @PathVariable String studentid, @PathVariable String courseid) {
        // Set student and course for the enrollment
        enrollment.setStudent(new Student(studentid, "", "", "", ""));
        enrollment.setCourse(new Course(courseid, "", ""));
        enrollmentService.addEnrollment(enrollment);
    }
    
    // Update an existing enrollment
    @PutMapping("/enrollment/edit/{studentid}/{courseid}")
    public void updateEnrollment(@RequestBody Enrollment enrollment, @PathVariable String studentid, @PathVariable String courseid) {
        // Set student and course for the enrollment
        enrollment.setStudent(new Student(studentid, "", "", "", ""));
        enrollment.setCourse(new Course(courseid, "", ""));
        enrollmentService.updateEnrollment(enrollment);
    }
    
    // Delete an enrollment by ID
    @DeleteMapping("/enrollment/{id}")
    public void deleteEnrollment(@PathVariable String id) {
        enrollmentService.deleteEnrollment(id);
    }
}
