package com.example.demo;

import org.hibernate.Session;

import com.example.demo.entities.Student;

public class HibernateTestApplication {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		Student student = new Student();
		student.setU_id(1);
		student.setFirstname("John");
		student.setLastname("Smith");
		System.out.println(student.toString());
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
	}
}
