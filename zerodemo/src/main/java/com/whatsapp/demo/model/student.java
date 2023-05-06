package com.whatsapp.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	@Id
	private int studentid;
	private String name;
	private String dept;
	private String email;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public student(int studentid, String name, String dept, String email) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.dept = dept;
		this.email = email;
	}
	

}
