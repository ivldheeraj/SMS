package com.cg.sms.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int deptID;
	private String deptName;
	private String deptHead;
	private String deptContact;
	
	
	public Department(int deptID, String deptName, String deptHead, String deptContact) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
		this.deptHead = deptHead;
		this.deptContact = deptContact;
	}
	public Department() {
		
	}
	public int getDeptID() {
		return deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	public String getDeptContact() {
		return deptContact;
	}
	public void setDeptContact(String deptContact) {
		this.deptContact = deptContact;
	}
	
	

	
      
	

}
