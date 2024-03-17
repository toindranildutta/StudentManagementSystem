package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.Course;

public interface CourseRespository extends JpaRepository<Course, String> {

}
