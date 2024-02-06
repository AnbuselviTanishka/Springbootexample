package com.example.MyFirstApplication;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService1  {
@Autowired
public StudentRepository1 studrep;
	public List<StudentEntity1> getData()
	{
		return studrep.findAll();
	}
}
