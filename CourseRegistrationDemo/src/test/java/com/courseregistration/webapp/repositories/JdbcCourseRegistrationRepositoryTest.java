package com.courseregistration.webapp.repositories;

import static org.junit.Assert.*;

import com.courseregistration.webapp.config.AppConfig;
import com.courseregistration.webapp.entities.*;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(classes = AppConfig.class)
@Transactional
public class JdbcCourseRegistrationRepositoryTest {
	@Autowired
	private CourseRegistrationRepository repository;
	
	@Before
	@SuppressWarnings("resource")
	public void init() throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		repository = (CourseRegistrationRepository) context.getBean("repository");
	}
	
	@Test
	public void testGetStudents() throws Exception {
		
		List<Student> students = repository.getStudents();
		assertEquals(students.size(), 15);
	}
	
	@Test
	public void testGetStudent() throws Exception {
		Student student = repository.getStudent(6);
		assertEquals(student.getFirstname(), "Ahi");
	}
}
