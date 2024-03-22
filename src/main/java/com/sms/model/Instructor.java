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
	@JoinColumn(name = "instructor_course", nullable = false)
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
	/**
	 * @return the instructorid
	 */
	public String getInstructorid() {
		return instructorid;
	}
	/**
	 * @param instructorid the instructorid to set
	 */
	public void setInstructorid(String instructorid) {
		this.instructorid = instructorid;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
		return "Instructor [instructorid=" + instructorid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", course=" + course + "]";
	}
}
