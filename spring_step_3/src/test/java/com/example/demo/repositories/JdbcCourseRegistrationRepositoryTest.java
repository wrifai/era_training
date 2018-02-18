package com.example.demo.repositories;

import static org.junit.Assert.*;

import com.example.demo.config.AppConfig;
import com.example.demo.entities.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/resources/applicationContext.xml")
@ContextConfiguration(classes = AppConfig.class)
@Transactional
@ActiveProfiles("test")
public class JdbcCourseRegistrationRepositoryTest {
	@Autowired
	private CourseRegistrationRepository repository;
	
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
