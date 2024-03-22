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
import com.sms.model.Instructor;
import com.sms.service.InstructorService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class InstructorController {
    
    @Autowired
    private InstructorService instructorService; // Autowired instructorService object
    
    // Retrieve all instructors
    @GetMapping("/instructors")
    public List<Instructor> getAllInstructors(){
        return instructorService.getAllInstructor();
    }
    
    // Retrieve an instructor by ID for a specific course
    @GetMapping("courses/{courseid}/instructor/{id}")
    public Optional<Instructor> getInstructor(@PathVariable String id) {
        return instructorService.getInstructor(id);
    }
    
    // Add a new instructor for a specific course
    @PostMapping("/courses/{id}/instructor")
    public void addInstructor(@RequestBody Instructor instructor, @PathVariable String id) {
        // Set the course for the instructor
        instructor.setCourse(new Course(id, "", ""));
        instructorService.addInstructor(id, instructor);
    }
    
    // Update an existing instructor for a specific course
    @PutMapping("/courses/{courseid}/instructors/{id}")
    public void updateInstructor(@RequestBody Instructor instructor, @PathVariable String courseid, @PathVariable String id) {
        // Set the course for the instructor
        instructor.setCourse(new Course(courseid, "", ""));
        instructorService.updateInstructor(id, courseid, instructor);
    }
    
    // Delete an instructor by ID
    @DeleteMapping("/instructors/{id}")
    public void deleteInstructor(@PathVariable String id) {
        instructorService.deleteInstructor(id);
    }
}
