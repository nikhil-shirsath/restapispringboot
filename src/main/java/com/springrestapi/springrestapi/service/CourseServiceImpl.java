package com.springrestapi.springrestapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.entites.Course;
@Service// to tell springboot its works on service layer and its working for implementtaion 
public class CourseServiceImpl implements CourseService {
	
	private List<Course> lst ;
	public CourseServiceImpl() {
		lst = new ArrayList<>();
		lst.add(new Course(11,"java","this is core java course"));
		lst.add(new Course(12,"c","this is c programming for logic building course"));
		lst.add(new Course(13,"cpp","this is cpp programiing for logic building course"));
	}
	
	@Override
	public List<Course> getAllCourses() {
		return lst;
	}

	@Override
	public Course getCourse(int courseId) {
		for(Course c :lst) {
			if(c.getCourseId()== courseId) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Course addCourse(Course course) {
		lst.add(course);
		return course ;
	}

}
