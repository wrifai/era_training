package com.example.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class Course {
	public String course_id;	
	public String title;
	public Integer credit_count;
	public String category;
	public String semester;
	public Integer teacher_id;
	
	public Course() {
		super();
		this.course_id = null;
		this.title = null;
		this.credit_count = null;
		this.category = null;
		this.semester = null;
		this.teacher_id = null;
	}

	public Course(String course_id, String title, Integer teacher_id) {
		super();
		this.course_id = course_id;
		this.title = title;
		this.credit_count = null;
		this.category = null;
		this.semester = null;
		this.teacher_id = teacher_id;
	}
	
	public Course(String course_id, String title, Integer credit_count, String category, String semester,
			Integer teacher_id) {
		super();
		this.course_id = course_id;
		this.title = title;
		this.credit_count = credit_count;
		this.category = category;
		this.semester = semester;
		this.teacher_id = teacher_id;
	}

	public String getCourse_id() {
		return course_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCredit_count() {
		return credit_count;
	}

	public void setCredit_count(Integer credit_count) {
		this.credit_count = credit_count;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Integer getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", title=" + title + ", credit_count=" + credit_count + ", category="
				+ category + ", semester=" + semester + ", teacher_id=" + teacher_id + "]";
	}
}
