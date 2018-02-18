package com.example.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class StudentCourse {
	public Integer u_id;
	public String course_id;
	
	public StudentCourse(Integer u_id, String course_id) {
		super();
		this.u_id = u_id;
		this.course_id = course_id;
	}
	
	public Integer getU_id() {
		return u_id;
	}
	
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	
	public String getCourse_id() {
		return course_id;
	}
	
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
}
