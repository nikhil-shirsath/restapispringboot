package com.springrestapi.springrestapi.service;

import java.util.List;

import com.springrestapi.springrestapi.entites.Course;

public interface CourseService {
	public List<Course> getAllCourses();

	public Course getCourse(int courseId);

	public Course addCourse(Course course);

	public Course deleteCourse(int couseId);

	public Course updateCourse(int courseId, Course course);
}
