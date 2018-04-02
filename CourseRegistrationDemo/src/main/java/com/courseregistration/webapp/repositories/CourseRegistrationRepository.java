package com.courseregistration.webapp.repositories;

import com.courseregistration.webapp.entities.Course;
import com.courseregistration.webapp.entities.Student;
import com.courseregistration.webapp.entities.StudentCourse;
import com.courseregistration.webapp.entities.Teacher;

import java.util.List;

public interface CourseRegistrationRepository {
	
	/*************************************** STUDENT FUNCTIONS ***************************************/
	
	List<Student> getStudents();

    Student getStudent(Integer i);

    Integer getNumberOfStudents();

    int createStudent(Integer u_id, String lastname, String firstname);

    Integer deleteStudent(Integer u_id);

    void updateStudent(Student Student);
    
    
    
    /*************************************** TEACHER FUNCTIONS ***************************************/
	
	List<Teacher> getTeachers();

    Teacher getTeacher(String teacher_id);

    Integer getNumberOfTeachers();

    int createTeacher(Integer teacher_id, String lastname, String firstname);

    Integer deleteTeacher(Integer teacher_id);

    void updateTeacher(Teacher teacher);
	
    
    
	/*************************************** COURSE FUNCTIONS ***************************************/
	
	List<Course> getCourses();

    Course getCourse(String course_id);

    Integer getNumberOfCourses();

    int createCourse(String course_id, String title, Integer teacher_id);

    Integer deleteCourse(String course_id);

    void updateCourse(Course course);
    
    
    
    /*************************************** REGISTRATION FUNCTIONS ***************************************/
	
	List<StudentCourse> getAllRegistrations();

    List<StudentCourse> getRegistrationsForStudent(String u_id);
    
    List<StudentCourse> getRegistrationsForCourse(String u_id);
    
    StudentCourse getRegistration(String u_id, String course_id);

    Integer getNumberOfRegistrations();
    
    Integer getNumberOfRegisteredStudents(String course_id);
    
    Integer getNumberOfRegisteredCourses(String u_id);

    int createRegistration(Integer u_id, String course_id);

    Integer deleteRegistration(Integer u_id, String course_id);
    
    Integer removeStudentFromAllRegistration(Integer u_id);
}
