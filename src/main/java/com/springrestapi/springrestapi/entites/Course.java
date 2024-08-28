package com.springrestapi.springrestapi.entites;

public class Course {
	private int courseId;
	private String courseName;
	private String couseDescp;
	
	
	
	public Course() {
		super();
	}
	public Course(int courseId) {
		super();
		this.courseId = courseId;
	}
	
	
	
	public Course(String courseName, String couseDescp) {
		super();
		this.courseName = courseName;
		this.couseDescp = couseDescp;
	}
	public Course(int courseId, String courseName, String couseDescp) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.couseDescp = couseDescp;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCouseDescp() {
		return couseDescp;
	}
	public void setCouseDescp(String couseDescp) {
		this.couseDescp = couseDescp;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", couseDescp=" + couseDescp + "]";
	}
	
	
}
