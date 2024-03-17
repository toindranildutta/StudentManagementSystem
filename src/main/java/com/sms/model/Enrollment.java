package com.sms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "enrollment_table")
public class Enrollment {
	
	@Id
	private String enrollmentid;
	private String enrollmentdate;
	@OneToOne
	private Student student;
	@OneToOne
	private Course course;
	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enrollment(String enrollmentid, String enrollmentdate, Student student, Course course) {
		super();
		this.enrollmentid = enrollmentid;
		this.enrollmentdate = enrollmentdate;
		this.student = student;
		this.course = course;
	}
	public String getEnrollmentid() {
		return enrollmentid;
	}
	public void setEnrollmentid(String enrollmentid) {
		this.enrollmentid = enrollmentid;
	}
	public String getEnrollmentdate() {
		return enrollmentdate;
	}
	public void setEnrollmentdate(String enrollmentdate) {
		this.enrollmentdate = enrollmentdate;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Enrollment [enrollmentid=" + enrollmentid + ", enrollmentdate=" + enrollmentdate + ", student="
				+ student + ", course=" + course + "]";
	}
}
