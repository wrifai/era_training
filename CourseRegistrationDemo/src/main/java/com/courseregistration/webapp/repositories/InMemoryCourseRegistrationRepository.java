package com.courseregistration.webapp.repositories;

import java.util.List;

import com.courseregistration.webapp.entities.Course;
import com.courseregistration.webapp.entities.Student;
import com.courseregistration.webapp.entities.StudentCourse;
import com.courseregistration.webapp.entities.Teacher;

public class InMemoryCourseRegistrationRepository implements CourseRegistrationRepository {

	// TODO Implement this in-memory class using maps as substitute to DB as used in JDBC class.
	
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudent(Integer u_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumberOfStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createStudent(Integer u_id, String lastname, String firstname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer deleteStudent(Integer u_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStudent(Student Student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher getTeacher(String teacher_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumberOfTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createTeacher(Integer teacher_id, String lastname, String firstname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer deleteTeacher(Integer teacher_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourse(String course_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumberOfCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createCourse(String course_id, String title, Integer teacher_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer deleteCourse(String course_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StudentCourse> getAllRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentCourse> getRegistrationsForStudent(String u_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentCourse> getRegistrationsForCourse(String u_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourse getRegistration(String u_id, String course_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumberOfRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumberOfRegisteredStudents(String course_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumberOfRegisteredCourses(String u_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createRegistration(Integer u_id, String course_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer deleteRegistration(Integer u_id, String course_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer removeStudentFromAllRegistration(Integer u_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
