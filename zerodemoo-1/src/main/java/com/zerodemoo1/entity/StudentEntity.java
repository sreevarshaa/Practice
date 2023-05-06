package com.zerodemoo1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	private int studentid;
	private String name;
	private String dept;
	private String email;
	StudentEntity(){}
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
	public StudentEntity(int studentid, String name, String dept, String email) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.dept = dept;
		this.email = email;
	}
	

}
