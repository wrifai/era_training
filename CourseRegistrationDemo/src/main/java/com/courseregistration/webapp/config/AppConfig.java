package com.courseregistration.webapp.config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import com.courseregistration.webapp.entities.Student;
import com.courseregistration.webapp.entities.StudentCourse;
import com.courseregistration.webapp.entities.Teacher;
import com.courseregistration.webapp.repositories.CourseRegistrationRepository;
import com.courseregistration.webapp.repositories.JdbcCourseRegistrationRepository;
import com.courseregistration.webapp.entities.Course;

import javax.sql.DataSource;

@Configuration
//@EnableJpaRepositories(basePackages = "com.example.demo.repositories")
@ComponentScan(basePackages = "com.courseregistration.webapp")
public class AppConfig {
	
	@Bean(name = "dataSource", destroyMethod = "shutdown")
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder()
				.generateUniqueName(true)
				.setType(EmbeddedDatabaseType.H2)
				.setScriptEncoding("UTF-8")
				.ignoreFailedDrops(true)
				.addScript("schema.sql")
				.addScripts("data.sql")
				.build();
	}
	
	@Bean(name = "repository")
	public CourseRegistrationRepository jdbcCourseRegistrationRepository() {
		return new JdbcCourseRegistrationRepository(dataSource());
	}
	
	@Bean
	public Student student() {
		return new Student();
	}
	
	@Bean
	public Teacher teacher() {
		return new Teacher();
	}
	
	@Bean
	public Course course() {
		return new Course();
	}
}
