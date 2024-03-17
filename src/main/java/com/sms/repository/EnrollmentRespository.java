package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.Enrollment;

public interface EnrollmentRespository extends JpaRepository<Enrollment, String> {

}
