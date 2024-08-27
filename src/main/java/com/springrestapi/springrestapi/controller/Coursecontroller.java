package com.springrestapi.springrestapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.springrestapi.entites.Course;
import com.springrestapi.springrestapi.service.CourseService;
import com.springrestapi.springrestapi.service.CourseServiceImpl;

@RestController
public class Coursecontroller {
	
	//we dont have to create this object for that we need let spring boot to do this word
	@Autowired 
	private CourseService cservice ;
	
	@GetMapping("/home")
	public String home() {
		String msg = "you are inside the home controller";
		return msg;
	}
	
	//to show all the courses we creast a method and map it using getmapping
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		List<Course> lst = cservice.getAllCourses();

		return lst;
	}
	
	@GetMapping("/courses/{courseId}")// when we have to take a value from the user in url then insted of taking it directly
									//we takes it as variable for that we uses {}	
	
	
	public Course getCourse(@PathVariable String courseId) {	//@pathvariable is must because without it you cant take value from the url otherwise error occurs.	
		return this.cservice.getCourse(Integer.parseInt(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		return this.cservice.addCourse(course);
	}
	
}
