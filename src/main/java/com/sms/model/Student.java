package com.sms.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student {				// Student Entity(Table)
	
	@Id
	private String studentid;			// Columns in the student Table
	private String firstname;
	private String lastname;
	private String email;
	private String phoneno;
	
		
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentid, String firstname, String lastname, String email, String phoneno) {
		super();
		this.studentid = studentid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phoneno = phoneno;

	}
	/**
	 * @return the studentid
	 */
	public String getStudentid() {
		return studentid;
	}
	/**
	 * @param studentid the studentid to set
	 */
	public void setStudentid(String studentid) {
		this.studentid = studentid;
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
	 * @return the phoneno
	 */
	public String getPhoneno() {
		return phoneno;
	}
	/**
	 * @param phoneno the phoneno to set
	 */
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	/**
	 * @return the course
	 */
	
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", phoneno=" + phoneno + "]";
	}
	
}
