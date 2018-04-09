package com.courseregistration.webapp.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.courseregistration.webapp.entities.StudentCourse;
import com.courseregistration.webapp.repositories.JdbcCourseRegistrationRepository;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private JdbcCourseRegistrationRepository repository;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/viewAllCourses", method = RequestMethod.GET)
	public String listCourses(Model model) {
		logger.info("Listing all courses.");
		
		model.addAttribute("courses", this.repository.getCourses());
		
		return "courses";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/{course_id}", method = RequestMethod.GET)
	public String viewCourse(Model model, @PathVariable("course_id") String course_id) {
		logger.info("Viewing course " + course_id + ".");
		
		model.addAttribute("course", this.repository.getCourse(course_id));
		model.addAttribute("registered_students", repository.getRegistrationsForCourse(course_id));
		model.addAttribute("registered_student_count", repository.getNumberOfRegisteredStudents(course_id));
		
		return "course";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addCourse(@ModelAttribute StudentCourse registration) {
		logger.info("Saving student.");
		this.repository.createRegistration(registration.u_id, registration.course_id);
		return "course_register";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerCourse(Locale locale, Model model) {
		logger.info("Going to course register page.");
		model.addAttribute("newRegistration", new StudentCourse());
		return "course_register";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/viewAllRegistrations", method = RequestMethod.GET)
	public String viewAllRegistrations(Locale locale, Model model) {
		logger.info("Listing all registrations.");
		
		model.addAttribute("registrations", this.repository.getAllRegistrations());
		
		return "registrations";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/deleteRegistration/{u_id}/{course_id}", method = RequestMethod.GET)
	public String deleteRegistration(@PathVariable int u_id, @PathVariable String course_id) {
		logger.info("Deleting registration.");
		
		this.repository.deleteRegistration(u_id, course_id);
		
		return "registrations";
	}
	
}
