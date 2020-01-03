package com.demo.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private int aid;
	private int did;
	private int cid;
	@JsonInclude
	@Transient
	private Department dep;
	@JsonInclude
	@Transient
	private Address add;
	@JsonInclude
	@Transient
	private College college;

	public Student() {

	}

	public Student(int sid, String sname, Department dep, Address add, College college) {
		this.sid = sid;
		this.sname = sname;
		this.dep = dep;
		this.add = add;
		this.college = college;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

}
