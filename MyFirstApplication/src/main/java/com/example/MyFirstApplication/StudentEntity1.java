package com.example.MyFirstApplication;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student") 
public class StudentEntity1 {
	

	public StudentEntity1() {
		super();
	}
	
	public StudentEntity1(String studname, int studid) {
		super();
		this.studname = studname;
		this.studid = studid;
	}

	private String studname;
	@Id
	private int studid;
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	

}
