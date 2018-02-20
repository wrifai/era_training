package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="studentcourse")
public class StudentCourse {
//  TODO: map many to many relationship here.
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="teacher_id")
	public Integer u_id;
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="teacher_id")
	public String course_id;
	
	public StudentCourse() {
		super();
		this.u_id = null;
		this.course_id = null;
	}

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
