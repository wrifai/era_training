package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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
import com.example.demo.entities.Course;

import javax.sql.DataSource;

@Configuration
//@EnableJpaRepositories(basePackages = "com.example.demo.repositories")
@ComponentScan(basePackages = "com.example")
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class AppConfig {
	
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
	
	@Bean
	public StudentCourse studentCourse() {
		return new StudentCourse(student(), course());
	}
	
//	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		
//		Student student = context.getBean("student", Student.class);
//		
//	}
	
//	@Autowired
//	private Environment env;
//
//	@Bean(name = "dataSource", destroyMethod = "shutdown")
//	@Profile("test")
//	public DataSource dataSourceForTest() {
//		return new EmbeddedDatabaseBuilder().generateUniqueName(true).setType(EmbeddedDatabaseType.H2)
//				.setScriptEncoding("UTF-8").ignoreFailedDrops(true).addScript("schema.sql").addScripts("data.sql")
//				.build();
//	}
//
//	@Bean(name = "transactionManager")
//	@Profile("test")
//	public PlatformTransactionManager transactionManagerForTest() {
//		return new DataSourceTransactionManager(dataSourceForTest());
//	}
}
