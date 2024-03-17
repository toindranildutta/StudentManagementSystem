package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.Assignment;

public interface AssignmentRespository extends JpaRepository<Assignment, String> {

}
