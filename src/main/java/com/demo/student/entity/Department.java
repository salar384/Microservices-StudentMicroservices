package com.demo.student.entity;

public class Department {
	private int did;
	private String dname;
	private String subjects;

	public Department() {

	}

	public Department(int did, String dname, String subjects) {

		this.did = did;
		this.dname = dname;
		this.subjects = subjects;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

}
