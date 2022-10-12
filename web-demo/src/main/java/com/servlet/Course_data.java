package com.servlet;

public class Course_data {
 private String course_id;
 private String course_Name;
 private String Duration;
 private int course_Fee;
public String getCourse_id() {
	return course_id;
}
public void setCourse_id(String course_id) {
	this.course_id = course_id;
}
public String getCourse_Name() {
	return course_Name;
}
public void setCourse_Name(String course_Name) {
	this.course_Name = course_Name;
}
public String getDuration() {
	return Duration;
}
public void setDuration(String duration) {
	Duration = duration;
}
public int getCourse_Fee() {
	return course_Fee;
}
public void setCourse_Fee(int course_Fee) {
	this.course_Fee = course_Fee;
}
public Course_data(String course_id, String course_Name, String duration, int course_Fee) {
	super();
	this.course_id = course_id;
	this.course_Name = course_Name;
	Duration = duration;
	this.course_Fee = course_Fee;
}
}
