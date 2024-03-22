package com.sms.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "assignment_table")
public class Assignment {
	
	@Id
	private String assignmentid;
	private String assignmentname;
	private String assignmentdesc;
	private String duedate;
	@ManyToOne
    @JoinColumn(name = "assignment_instructor_id", nullable = false)
    private Instructor instructor;
	/**
	 * 
	 */
	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param assignmentid
	 * @param assignmentname
	 * @param assignmentdesc
	 * @param duedate
	 * @param instructor
	 */
	public Assignment(String assignmentid, String assignmentname, String assignmentdesc, String duedate,
			Instructor instructor) {
		super();
		this.assignmentid = assignmentid;
		this.assignmentname = assignmentname;
		this.assignmentdesc = assignmentdesc;
		this.duedate = duedate;
		this.instructor = instructor;
	}
	/**
	 * @return the assignmentid
	 */
	public String getAssignmentid() {
		return assignmentid;
	}
	/**
	 * @param assignmentid the assignmentid to set
	 */
	public void setAssignmentid(String assignmentid) {
		this.assignmentid = assignmentid;
	}
	/**
	 * @return the assignmentname
	 */
	public String getAssignmentname() {
		return assignmentname;
	}
	/**
	 * @param assignmentname the assignmentname to set
	 */
	public void setAssignmentname(String assignmentname) {
		this.assignmentname = assignmentname;
	}
	/**
	 * @return the assignmentdesc
	 */
	public String getAssignmentdesc() {
		return assignmentdesc;
	}
	/**
	 * @param assignmentdesc the assignmentdesc to set
	 */
	public void setAssignmentdesc(String assignmentdesc) {
		this.assignmentdesc = assignmentdesc;
	}
	/**
	 * @return the duedate
	 */
	public String getDuedate() {
		return duedate;
	}
	/**
	 * @param duedate the duedate to set
	 */
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	/**
	 * @return the instructor
	 */
	public Instructor getInstructor() {
		return instructor;
	}
	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	@Override
	public String toString() {
		return "Assignment [assignmentid=" + assignmentid + ", assignmentname=" + assignmentname + ", assignmentdesc="
				+ assignmentdesc + ", duedate=" + duedate + ", instructor=" + instructor + "]";
	}
	

}
