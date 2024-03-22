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

import com.sms.model.Assignment;
import com.sms.model.Course;
import com.sms.model.Instructor;
import com.sms.service.AssignmentService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class AssignmentController {
    
    @Autowired
    private AssignmentService assignmentService; // Autowired assignmentService object

    // Retrieve all assignments
    @GetMapping("/assignments")
    public List<Assignment> getAllAssignment() {
        return assignmentService.getAllAssignment();
    }

    // Retrieve a single assignment by ID
    @GetMapping("/assignment/{id}")
    public Optional<Assignment> getAssignment(@PathVariable String id) {
        return assignmentService.getAssignment(id);
    }

    // Create a new assignment
    @PostMapping("/assignments/{courseid}/{instructorid}")
    public void addAssignment(@RequestBody Assignment assignment, @PathVariable String courseid,
            @PathVariable String instructorid) {
        // Set instructor and course for the assignment
        assignment.setInstructor(new Instructor(instructorid, "", "", "", new Course(courseid, "", "")));
        assignmentService.addAssignment(assignment);
    }

    // Update an existing assignment
    @PutMapping("/assignments/{courseid}/{instructorid}/{id}")
    public void updateAssignment(@RequestBody Assignment assignment, @PathVariable String courseid,
            @PathVariable String instructorid, @PathVariable String id) {
        // Set instructor and course for the assignment
        assignment.setInstructor(new Instructor(instructorid, "", "", "", new Course(courseid, "", "")));
        assignmentService.updateAssignment(assignment);
    }

    // Delete an assignment by ID
    @DeleteMapping("/assignment/{id}")
    public void deleteAssignment(@PathVariable String id) {
        assignmentService.deleteAssignment(id);
    }
}
