package com.example.MyFirstApplication.Student;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "dept")
public class ChildEntity {
	
	 
		@Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int deptid; // Other
		
		public int getDeptid() {
			return deptid;
		}

		public void setDeptid(int deptid) {
			this.deptid = deptid;
		}

		@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		 @JoinColumn(name = "studid", referencedColumnName = "studid") 
		 private StudentEntity	 parent;

		public StudentEntity getParent() {
			return parent;
		}

		public void setParent(StudentEntity parent) {
			this.parent = parent;
		}
		
		}

