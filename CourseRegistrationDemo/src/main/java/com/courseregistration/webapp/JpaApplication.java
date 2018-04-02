package com.courseregistration.webapp;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.courseregistration.webapp.entities.Course;
import com.courseregistration.webapp.entities.Student;
import com.courseregistration.webapp.entities.StudentCourse;
import com.courseregistration.webapp.entities.Teacher;

public class JpaApplication {
	public static void main(String[] args) {
		
		
		/* Obtain Session and Call Persistence Methods */
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Student student = new Student();
		student.setFirstname("Elon");
		student.setLastname("Musk");
		student.setU_id(1);
		
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}
}
