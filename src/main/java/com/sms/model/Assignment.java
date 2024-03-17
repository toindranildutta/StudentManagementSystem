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
    @JoinColumn(name = "assignment_instructor_id")
    private Instructor instructor;
	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assignment(String assignmentid, String assignmentname, String assignmentdesc, String duedate,
			Instructor instructor) {
		super();
		this.assignmentid = assignmentid;
		this.assignmentname = assignmentname;
		this.assignmentdesc = assignmentdesc;
		this.duedate = duedate;
		this.instructor = instructor;
	}
	public String getAssignmentid() {
		return assignmentid;
	}
	public void setAssignmentid(String assignmentid) {
		this.assignmentid = assignmentid;
	}
	public String getAssignmentname() {
		return assignmentname;
	}
	public void setAssignmentname(String assignmentname) {
		this.assignmentname = assignmentname;
	}
	public String getAssignmentdesc() {
		return assignmentdesc;
	}
	public void setAssignmentdesc(String assignmentdesc) {
		this.assignmentdesc = assignmentdesc;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	@Override
	public String toString() {
		return "Assignment [assignmentid=" + assignmentid + ", assignmentname=" + assignmentname + ", assignmentdesc="
				+ assignmentdesc + ", duedate=" + duedate + ", instructor=" + instructor + "]";
	}

}
