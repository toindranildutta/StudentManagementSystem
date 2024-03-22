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
	/**
	 * 
	 */
	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param enrollmentid
	 * @param enrollmentdate
	 * @param student
	 * @param course
	 */
	public Enrollment(String enrollmentid, String enrollmentdate, Student student, Course course) {
		super();
		this.enrollmentid = enrollmentid;
		this.enrollmentdate = enrollmentdate;
		this.student = student;
		this.course = course;
	}
	/**
	 * @return the enrollmentid
	 */
	public String getEnrollmentid() {
		return enrollmentid;
	}
	/**
	 * @param enrollmentid the enrollmentid to set
	 */
	public void setEnrollmentid(String enrollmentid) {
		this.enrollmentid = enrollmentid;
	}
	/**
	 * @return the enrollmentdate
	 */
	public String getEnrollmentdate() {
		return enrollmentdate;
	}
	/**
	 * @param enrollmentdate the enrollmentdate to set
	 */
	public void setEnrollmentdate(String enrollmentdate) {
		this.enrollmentdate = enrollmentdate;
	}
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Enrollment [enrollmentid=" + enrollmentid + ", enrollmentdate=" + enrollmentdate + ", student="
				+ student + ", course=" + course + "]";
	}
	
	
}
