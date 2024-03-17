package com.sms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_table")
public class Course {
	
	@Id
	private String courseid;
	private String coursename;
	private String coursedesc;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseid, String coursename, String coursedesc) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.coursedesc = coursedesc;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCoursedesc() {
		return coursedesc;
	}
	public void setCoursedesc(String coursedesc) {
		this.coursedesc = coursedesc;
	}
	
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", coursedesc=" + coursedesc
				+ "]";
	}
	
}
