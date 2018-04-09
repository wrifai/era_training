package com.courseregistration.webapp.controllers;

import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.courseregistration.webapp.entities.Student;
import com.courseregistration.webapp.repositories.JdbcCourseRegistrationRepository;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private JdbcCourseRegistrationRepository repository;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/viewAll", method = RequestMethod.GET)
	public String listStudents(Model model) {
		logger.info("Listing all students.");
		
		model.addAttribute("students", this.repository.getStudents() );
		
		return "students";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addStudent(HttpSession session, Model model) {
		logger.info("Going to add student page.");
				
		return "student_add";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student) {
		logger.info("Saving student.");
		this.repository.createStudent(student.u_id, 
				student.ssn, 
				student.lastname, 
				student.firstname, 
				student.phone, 
				student.address, 
				student.city, 
				student.state, 
				student.zip);
		return "student_add";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/delete/{u_id}", method = RequestMethod.GET)
	public String deleteStudent(@PathVariable int u_id) {
		logger.info("Deleting student.");
		this.repository.deleteStudent(u_id);
		return "students";
	}
	
}
