package com.example.MyFirstApplication.Student;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity {

	public StudentEntity() {
		super();
	}

	public StudentEntity(String studname, int studid) {
		super();
		this.studname = studname;
		this.studid = studid;
	}
	@Id
	private String studname;
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
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