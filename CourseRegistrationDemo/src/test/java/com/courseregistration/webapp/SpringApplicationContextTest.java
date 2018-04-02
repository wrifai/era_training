package com.courseregistration.webapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
// .jpa.EnableJpaRepositories
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.courseregistration.webapp.entities.Student;
import com.courseregistration.webapp.entities.StudentCourse;
import com.courseregistration.webapp.entities.Teacher;
import com.courseregistration.webapp.config.AppConfig;
import com.courseregistration.webapp.entities.Course;

import javax.sql.DataSource;

public class SpringApplicationContextTest {

	@Test
	public void contextLoads() {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("There are " + context.getBeanDefinitionCount() + " beans.");
		for (String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
