package com.example.MyFirstApplication.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class StudentController {
    @Autowired
    public StudentService studser;
    @Autowired
    public StudentRepository studrep;
    ArrayList<Integer> a = new ArrayList<>();
    
    @RequestMapping(value="/data/{studname}",method=RequestMethod.GET)
    	public Optional<StudentEntity> displayData(@PathVariable("studname") String id)
	{
		System.out.println(studser.getData(id));
		return studser.getData(id);
	}
    
    @RequestMapping(value="/data",method=RequestMethod.POST)
    public StudentEntity insertData(@RequestBody StudentEntity se)
    {
    	
    	return studser.insertData(se);
    }
  
     @RequestMapping("/data/{studname}")
   public void deleteById(@PathVariable("studname") String name) {

    	studser.delete(name);
	}
    
    @PutMapping("/data/{studid}")  
    private void update(@PathVariable int studid ,@RequestBody StudentEntity se)   
    {  
    studser.saveOrUpdate(studid,se);  
    
    }  
   
    @RequestMapping(value="/display")
    public List<StudentEntity> displayData()
    {
    	
    	return studser.getAllStudents();
    }
 
@GetMapping("/")
public ModelAndView viewHomePage() {
	
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("listStudents", studser.getAllStudents());
	modelAndView.setViewName("index");
	return modelAndView;
}
@GetMapping("/selection-expression")
public ModelAndView selectionExpression(Model model){
    StudentEntity stud = new StudentEntity();
    stud.setStudid(7);   
    stud.setStudname("TanishkaAnbu");
    StudentEntity stud1 = new StudentEntity();
    stud1.setStudid(8);   
    stud1.setStudname("AnbuTanishka");
    ModelAndView mv=new ModelAndView();
    mv.addObject("stud", stud);
    mv.addObject("stud1", stud1);
    mv.setViewName("message");
    return mv;
}

	
}
