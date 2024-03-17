package com.sms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "instructor_table")
public class Instructor {
	
	@Id
	private String instructorid;
	private String firstname;
	private String lastname;
	private String email;
	@ManyToOne
	@JoinColumn(name = "instructor_course")
	private Course course;
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Instructor(String instructorid, String firstname, String lastname, String email, Course course) {
		super();
		this.instructorid = instructorid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.course = course;
	}
	public String getInstructorid() {
		return instructorid;
	}
	public void setInstructorid(String instructorid) {
		this.instructorid = instructorid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Instructor [instructorid=" + instructorid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", Email=" + email + ", course=" + course + "]";
	}
	
}
