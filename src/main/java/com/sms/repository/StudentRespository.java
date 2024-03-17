package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.Student;

public interface StudentRespository extends JpaRepository<Student, String> {

}
