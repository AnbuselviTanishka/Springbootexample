package com.example.MyFirstApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController1 {
   /* @Autowired
    public StudentService1 studser;
    @RequestMapping(value="/path",method=RequestMethod.GET)
    	public List<StudentEntity1> displayData()
	{
		System.out.println(studser.getData());
		return studser.get
	}
 /*  @RequestMapping(value="/path",method=RequestMethod.GET)
    public String disdata()
    {
    	return "hai welcome";
    }*/
	
}
