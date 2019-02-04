package com.endurance.springdemo.rest;

/*
 * REST Controller
 */

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endurance.springdemo.entity.Student;

@RestController  
@RequestMapping("/api") //maps requests with "/api"
public class StudentRestController {

	List<Student> theStudents;
	
	//define @PostConstruct to load student data only once
	
	@PostConstruct //initializes the arrayList with the values
	public void loadData() {
		theStudents = new ArrayList<Student>();
		theStudents.add(new Student("poornima","patel","History",12));
		theStudents.add(new Student("Jipsa", "Mathew", "Computer Science", 9));
		theStudents.add(new Student("Jake","Thomas", "Artificial Intelligence", 6));
		
	}
	//define student endpoint
	
	//to get all student details
	@GetMapping("/students")
	public List<Student> getStudent(){
		return theStudents;
	}
	
	
	@GetMapping("/student/{stuId}")
	
	//PathVariable is the value to be appended as part of url
	public Student getStudent(@PathVariable int stuId){
		
		if(stuId>=theStudents.size()||stuId<0) {
			throw new StudentNotFoundException("Student id "+stuId +" is not found");
		}
	
		return theStudents.get(stuId); 
	}


}

