package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.Instructor;

public interface InstructorRespository extends JpaRepository<Instructor, String> {

}
