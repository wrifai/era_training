package com.courseregistration.webapp.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.courseregistration.webapp.repositories.JdbcCourseRegistrationRepository;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private JdbcCourseRegistrationRepository repository;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/viewAll", method = RequestMethod.GET)
	public String listTeachers(Locale locale, Model model) {
		logger.info("Listing all teachers.", locale);
		
		model.addAttribute("teachers", this.repository.getTeachers() );
		
		return "teachers";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/modify/add", method = RequestMethod.GET)
	public String addTeacher(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
