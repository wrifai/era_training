package com.courseregistration.webapp;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.courseregistration.webapp.entities.Course;
import com.courseregistration.webapp.entities.Student;
import com.courseregistration.webapp.entities.StudentCourse;
import com.courseregistration.webapp.entities.Teacher;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			/* Configuration */
			Configuration configuration = new Configuration();
			
			configuration.addAnnotatedClass(Student.class);
			configuration.addAnnotatedClass(Teacher.class);
			configuration.addAnnotatedClass(Course.class);
			configuration.addAnnotatedClass(StudentCourse.class);
			
			/* Building SessionFactory */
			return configuration.buildSessionFactory(new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.build());
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("There was an error building the factory");
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
