package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
// .jpa.EnableJpaRepositories
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.entities.Student;
import com.example.demo.entities.StudentCourse;
import com.example.demo.entities.Teacher;
import com.example.demo.config.AppConfig;
import com.example.demo.entities.Course;

import javax.sql.DataSource;

public class SpringStep3ApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("START--------------------------------------------");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("CONTEXT--------------------------------------------");
		
		System.out.println("There are " + context.getBeanDefinitionCount() + "beans.");
		for (String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		
		Student student = context.getBean("student", Student.class);
		student.setFirstname("Nikolas");
		student.setLastname("Cruz");
		
		System.out.println(student.toString());
	}

}
