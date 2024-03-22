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
	/**
	 * 
	 */
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param courseid
	 * @param coursename
	 * @param coursedesc
	 */
	public Course(String courseid, String coursename, String coursedesc) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.coursedesc = coursedesc;
	}
	/**
	 * @return the courseid
	 */
	public String getCourseid() {
		return courseid;
	}
	/**
	 * @param courseid the courseid to set
	 */
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	/**
	 * @return the coursename
	 */
	public String getCoursename() {
		return coursename;
	}
	/**
	 * @param coursename the coursename to set
	 */
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	/**
	 * @return the coursedesc
	 */
	public String getCoursedesc() {
		return coursedesc;
	}
	/**
	 * @param coursedesc the coursedesc to set
	 */
	public void setCoursedesc(String coursedesc) {
		this.coursedesc = coursedesc;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", coursedesc=" + coursedesc + "]";
	}
	
	
	
	
	
}
