package com.courseregistration.webapp.repositories;

import com.courseregistration.webapp.entities.Course;
import com.courseregistration.webapp.entities.Student;
import com.courseregistration.webapp.entities.StudentCourse;
import com.courseregistration.webapp.entities.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
//@Profile({"test"})
public class JdbcCourseRegistrationRepository implements CourseRegistrationRepository{
	private JdbcTemplate template;
	
	@Autowired
    public JdbcCourseRegistrationRepository(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }
	
	/*************************************** STUDENT FUNCTIONS ***************************************/
	private class StudentMapper implements RowMapper<Student> {
		@Override
        public Student mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Student(resultSet.getInt("U_ID"),
            		resultSet.getString("SSN"),
            		resultSet.getString("LASTNAME"),
            		resultSet.getString("FIRSTNAME"),
					resultSet.getString("PHONE"),
					resultSet.getString("ADDRESS"),
					resultSet.getString("CITY"),
					resultSet.getString("STATE"),
					resultSet.getString("ZIP"));
        }
    }
	
	@Override
	public List<Student> getStudents() {
		String sqlTxt = "SELECT * FROM STUDENT";
        return template.query(sqlTxt, new StudentMapper());
	}

	@Override
	public Student getStudent(Integer u_id) {
		String sqlTxt = "SELECT * FROM STUDENT WHERE U_ID=?";
        return template.queryForObject(sqlTxt, new StudentMapper(), u_id);
	}

	@Override
	public Integer getNumberOfStudents() {
		String sqlTxt = "SELECT COUNT(*) FROM STUDENT";
        return template.queryForObject(sqlTxt, Integer.class);
	}

	@Override
	public int createStudent(Integer u_id, String lastname, String firstname) {
		String sqlTxt = "INSERT INTO STUDENT (U_ID, LASTNAME, FIRSTNAME) VALUES(?, ?, ?);";
        return template.update(sqlTxt, u_id, lastname, firstname);
	}
	
	public int createStudent(Integer u_id, String ssn, String lastname, String firstname, String phone, String address, String city,
			String state, String zip) {
		String sqlTxt = "INSERT INTO STUDENT (U_ID, SSN, LASTNAME, FIRSTNAME, PHONE, ADDRESS, CITY, STATE, ZIP) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        return template.update(sqlTxt, u_id, ssn, lastname, firstname, phone, address, city, state, zip);
	}

	@Override
	public Integer deleteStudent(Integer u_id) {
		removeStudentFromAllRegistration(u_id); // Remove student from all courses, before deleting them from roster.
		String sqlTxt = "DELETE FROM STUDENT WHERE U_ID=?";
        return template.update(sqlTxt, u_id);
	}

	@Override
	public void updateStudent(Student student) {
		template.update("UPDATE STUDENT SET SSN = ? WHERE U_ID = ?", student.getSsn(), student.getU_id());
		template.update("UPDATE STUDENT SET LASTNAME = ? WHERE U_ID = ?", student.getLastname(), student.getU_id());
		template.update("UPDATE STUDENT SET FIRSTNAME = ? WHERE U_ID = ?", student.getFirstname(), student.getU_id());
		template.update("UPDATE STUDENT SET PHONE = ? WHERE U_ID = ?", student.getPhone(), student.getU_id());
        template.update("UPDATE STUDENT SET ADDRESS = ? WHERE U_ID = ?", student.getAddress(), student.getU_id());
        template.update("UPDATE STUDENT SET CITY = ? WHERE U_ID = ?", student.getCity(), student.getU_id());
        template.update("UPDATE STUDENT SET STATE = ? WHERE U_ID = ?", student.getState(), student.getU_id());
        template.update("UPDATE STUDENT SET ZIP = ? WHERE U_ID = ?", student.getZip(), student.getU_id());
	}

	
	
	/*************************************** COURSE FUNCTIONS ***************************************/
	private class CourseMapper implements RowMapper<Course> {
        @Override
        public Course mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Course(resultSet.getString("COURSE_ID"), 
            		resultSet.getString("TITLE"), 
            		resultSet.getInt("CREDIT_COUNT"),
            		resultSet.getString("CATEGORY"),
            		resultSet.getString("SEMESTER"),
            		resultSet.getInt("TEACHER_ID"));
        }
    }
	
	@Override
	public List<Course> getCourses() {
		String sqlTxt = "SELECT * FROM COURSE";
        return template.query(sqlTxt, new CourseMapper());
	}

	@Override
	public Course getCourse(String course_id) {
		String sqlTxt = "SELECT * FROM COURSE WHERE COURSE_ID=?";
        return template.queryForObject(sqlTxt, new CourseMapper(), course_id);
	}

	@Override
	public Integer getNumberOfCourses() {
		String sqlTxt = "SELECT COUNT(*) FROM COURSE";
        return template.queryForObject(sqlTxt, Integer.class);
	}

	@Override
	public int createCourse(String course_id, String title, Integer teacher_id) {
		String sqlTxt = "INSERT INTO COURSE (COURSE_ID, TITLE, TEACHER_ID) VALUES(?, ?, ?);";
        return template.update(sqlTxt, course_id, title, teacher_id);
	}
	
	public int createCourse(String course_id, String title, Integer credit_count, String category, String semester, Integer teacher_id) {
		String sqlTxt = "INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES(?, ?, ?, ?, ?, ?);";
        return template.update(sqlTxt, course_id, title, credit_count, category, semester, teacher_id);
	}

	@Override
	public Integer deleteCourse(String course_id) {
		String sqlTxt = "DELETE FROM COURSE WHERE COURSE_ID=?";
        return template.update(sqlTxt, course_id);
	}
	
	public Integer deleteCourseByTeacher(Integer teacher_id) {
		String sqlTxt = "DELETE FROM COURSE WHERE TEACHER_ID=?";
        return template.update(sqlTxt, teacher_id);
	}

	@Override
	public void updateCourse(Course course) {
		template.update("UPDATE COURSE SET TITLE = ? WHERE COURSE_ID = ?", course.getTitle(), course.getCourse_id());
		template.update("UPDATE COURSE SET CREDIT_COUNT = ? WHERE COURSE_ID = ?", course.getCredit_count(), course.getCourse_id());
		template.update("UPDATE COURSE SET CATEGORY = ? WHERE COURSE_ID = ?", course.getCategory(), course.getCourse_id());
		template.update("UPDATE COURSE SET SEMESTER = ? WHERE COURSE_ID = ?", course.getSemester(), course.getCourse_id());
        template.update("UPDATE COURSE SET TEACHER_ID = ? WHERE COURSE_ID = ?", course.getTeacher_id(), course.getCourse_id());
	}

	
	
	/*************************************** TEACHER FUNCTIONS ***************************************/
	private class TeacherMapper implements RowMapper<Teacher> {
		@Override
        public Teacher mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Teacher(resultSet.getInt("TEACHER_ID"),
            		resultSet.getString("SSN"),
            		resultSet.getString("LASTNAME"),
            		resultSet.getString("FIRSTNAME"),
					resultSet.getString("PHONE"),
					resultSet.getString("OFFICE"),
					resultSet.getString("ADDRESS"),
					resultSet.getString("CITY"),
					resultSet.getString("STATE"),
					resultSet.getString("ZIP"));
        }
    }
	
	@Override
	public List<Teacher> getTeachers() {
		String sqlTxt = "SELECT * FROM TEACHER";
        return template.query(sqlTxt, new TeacherMapper());
	}

	@Override
	public Teacher getTeacher(String teacher_id) {
		String sqlTxt = "SELECT * FROM TEACHER WHERE TEACHER_ID=?";
        return template.queryForObject(sqlTxt, new TeacherMapper(), teacher_id);
	}

	@Override
	public Integer getNumberOfTeachers() {
		String sqlTxt = "SELECT COUNT(*) FROM TEACHER";
        return template.queryForObject(sqlTxt, Integer.class);
	}

	@Override
	public int createTeacher(Integer teacher_id, String lastname, String firstname) {
		String sqlTxt = "INSERT INTO TEACHER (TEACHER_ID, LASTNAME, FIRSTNAME) VALUES(?, ?, ?);";
        return template.update(sqlTxt, teacher_id, lastname, firstname);
	}
	
	public int createTeacher(Integer u_id, String ssn, String lastname, String firstname, String phone, String office, String address, String city,
			String state, String zip) {
		String sqlTxt = "INSERT INTO TEACHER (U_ID, SSN, LASTNAME, FIRSTNAME, PHONE, OFFICE, ADDRESS, CITY, STATE, ZIP) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        return template.update(sqlTxt, u_id, ssn, lastname, firstname, phone, office, address, city, state, zip);
	}

	@Override
	public Integer deleteTeacher(Integer teacher_id) {
		deleteCourseByTeacher(teacher_id); // Remove all courses taught by teacher, before deleting them from roster.
		String sqlTxt = "DELETE FROM TEACHER WHERE TEACHER_ID=?";
        return template.update(sqlTxt, teacher_id);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		template.update("UPDATE TEACHER SET SSN = ? WHERE U_ID = ?", teacher.getSsn(), teacher.getTeacher_id());
		template.update("UPDATE TEACHER SET LASTNAME = ? WHERE U_ID = ?", teacher.getLastname(), teacher.getTeacher_id());
		template.update("UPDATE TEACHER SET FIRSTNAME = ? WHERE U_ID = ?", teacher.getFirstname(), teacher.getTeacher_id());
		template.update("UPDATE TEACHER SET PHONE = ? WHERE U_ID = ?", teacher.getPhone(), teacher.getTeacher_id());
		template.update("UPDATE TEACHER SET OFFICE = ? WHERE U_ID = ?", teacher.getOffice(), teacher.getTeacher_id());
        template.update("UPDATE TEACHER SET ADDRESS = ? WHERE U_ID = ?", teacher.getAddress(), teacher.getTeacher_id());
        template.update("UPDATE TEACHER SET CITY = ? WHERE U_ID = ?", teacher.getCity(), teacher.getTeacher_id());
        template.update("UPDATE TEACHER SET STATE = ? WHERE U_ID = ?", teacher.getState(), teacher.getTeacher_id());
        template.update("UPDATE TEACHER SET ZIP = ? WHERE U_ID = ?", teacher.getZip(), teacher.getTeacher_id());
	}

	
	
    /*************************************** REGISTRATION FUNCTIONS ***************************************/
	private class RegistrationMapper implements RowMapper<StudentCourse> {
		@Override
        public StudentCourse mapRow(ResultSet resultSet, int i) throws SQLException {
            return new StudentCourse(resultSet.getInt("U_ID"),
					resultSet.getString("COURSE_ID"));
        }
    }
	
	@Override
	public List<StudentCourse> getAllRegistrations() {
		String sqlTxt = "SELECT * FROM STUDENTCOURSE";
        return template.query(sqlTxt, new RegistrationMapper());
	}

	@Override
	public List<StudentCourse> getRegistrationsForStudent(String u_id) {
		String sqlTxt = "SELECT * FROM STUDENTCOURSE WHERE U_ID=?";
        return template.query(sqlTxt, new RegistrationMapper());
	}
	
	@Override
	public List<StudentCourse> getRegistrationsForCourse(String u_id) {
		String sqlTxt = "SELECT * FROM STUDENTCOURSE WHERE COURSE_ID=?";
        return template.query(sqlTxt, new RegistrationMapper());
	}

	@Override
	public StudentCourse getRegistration(String u_id, String course_id) {
		String sqlTxt = "SELECT * FROM STUDENTCOURSE WHERE U_ID=? AND COURSE_ID=?";
        return template.queryForObject(sqlTxt, new RegistrationMapper(), u_id, course_id);
	}

	@Override
	public Integer getNumberOfRegistrations() {
		String sqlTxt = "SELECT COUNT(*) FROM STUDENTCOURSE";
        return template.queryForObject(sqlTxt, Integer.class);
	}

	@Override
	public Integer getNumberOfRegisteredStudents(String course_id) {
		String sqlTxt = "SELECT COUNT(*) FROM STUDENTCOURSE WHERE COURSE_ID=?";
        return template.queryForObject(sqlTxt, Integer.class, course_id);
	}
	
	@Override
	public Integer getNumberOfRegisteredCourses(String u_id) {
		String sqlTxt = "SELECT COUNT(*) FROM STUDENTCOURSE WHERE U_ID=?";
        return template.queryForObject(sqlTxt, Integer.class, u_id);
	}

	@Override
	public int createRegistration(Integer u_id, String course_id) {
		String sqlTxt = "INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(?, ?);";
        return template.update(sqlTxt, u_id, course_id);
	}

	@Override
	public Integer deleteRegistration(Integer u_id, String course_id) {
		String sqlTxt = "DELETE FROM STUDENTCOURSE WHERE U_ID=? AND COURSE_ID=?";
        return template.update(sqlTxt, u_id, course_id);
	}

	@Override
	public Integer removeStudentFromAllRegistration(Integer u_id) {
		String sqlTxt = "DELETE FROM STUDENTCOURSE WHERE U_ID=?";
        return template.update(sqlTxt, u_id);
	}
}
