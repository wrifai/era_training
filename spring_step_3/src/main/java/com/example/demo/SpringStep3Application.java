package com.example.demo;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStep3Application {
//	static final String JDBC_DRIVER = "org.h2.Driver"; // org.h2.Driver
//	static final String DB_URL = "jdbc:h2:~/test";
//
//	static final String USERNAME = "Wali";
//	static final String PASSWORD = "";

	public static void main(String[] args) {
//		buildData();
		SpringApplication.run(SpringStep3Application.class, args);
	}

//	private static void buildData() {
//		Connection connection = null;
//		Statement statement = null;
//
//		try {
//			Class.forName("org.h2.Driver");
//
//			System.out.println("Connecting to H2 database...");
//			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//			System.out.println("Connected to database.");
//			System.out.println("Creating tables...");
//			
//			statement = connection.createStatement();
//			
//			statement.executeUpdate("CREATE TABLE STUDENT (" + 
//					"U_ID INT PRIMARY KEY NOT NULL ," + 
//					"SSN VARCHAR2(11) ," + 
//					"LASTNAME VARCHAR2(40)  NOT NULL ," + 
//					"FIRSTNAME VARCHAR2(20)  NOT NULL ," + 
//					"PHONE VARCHAR2(12) ," + 
//					"ADDRESS VARCHAR2(40) ," + 
//					"CITY VARCHAR2(20) ," + 
//					"STATE VARCHAR2(2) ," + 
//					"ZIP VARCHAR2(5) ," + 
//					") ;");
//			
//			statement.executeUpdate("CREATE TABLE  TEACHER (" + 
//					"TEACHER_ID INT PRIMARY KEY NOT NULL ," + 
//					"SSN VARCHAR2(11) ," + 
//					"LASTNAME VARCHAR2(40)  NOT NULL ," + 
//					"FIRSTNAME VARCHAR2(20)  NOT NULL ," + 
//					"PHONE VARCHAR2(12) ," + 
//					"OFFICE VARCHAR2(7) ," + 
//					"ADDRESS VARCHAR2(40) ," + 
//					"CITY VARCHAR2(20) ," + 
//					"STATE VARCHAR2(2) ," + 
//					"ZIP VARCHAR2(5) ," + 
//					") ;");
//			
//			statement.executeUpdate("CREATE TABLE  COURSE (" + 
//					"COURSE_ID VARCHAR2(8) PRIMARY KEY NOT NULL ," + 
//					"TITLE VARCHAR2(80)  NOT NULL ," + 
//					"CREDIT_COUNT NUMBER(1) ," + 
//					"CATEGORY VARCHAR2(4) ," + 
//					"SEMESTER VARCHAR2(10) ," + 
//					"TEACHER_ID NUMBER(9) NOT NULL ," + 
//					"FOREIGN KEY (TEACHER_ID) REFERENCES TEACHER(TEACHER_ID)" + 
//					") ;");
//			
//			statement.executeUpdate("CREATE TABLE  STUDENTCOURSE (" + 
//					"U_ID NUMBER(9) PRIMARY KEY NOT NULL ," + 
//					"COURSE_ID VARCHAR2(8) PRIMARY KEY NOT NULL ," + 
//					") ;");
//			
//			System.out.println("Created tables.");
//			
//			System.out.println("Inserting records into the tables...");
//			
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(1, '998-72-3567', 'Singer', 'Albert', '801 826-0752', '123 3rd Street', 'St. George', 'UT', '84152');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(2, '722-51-5454', 'Thompson', 'Mike', '219 547-9982', '3 Bald Eagle Drive', 'Chicago', 'IL', '60631');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(3, '893-72-1158', 'Apilado', 'Sergey', '707 448-4982', '1 Fizzy Street', 'Anaheim', 'CA', '95688');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(4, '724-80-9391', 'MacDouglas', 'Spencer', '415 354-7128', '47 Cumbre Ct.', 'Oakland', 'CA', '94612');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(5, '427-17-2319', 'Dingy', 'Ann', '415 836-7128', '3410 RedWing St.', 'Santa Clara', 'CA', '94301');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(6, '672-71-3249', 'Suko', 'Ahi', '415 935-4228', '3 Silver Ct.', 'Walnut Creek', 'CA', '94595');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(7, '267-41-2394', 'Farhey', 'Michael', '408 286-2428', '44 Homestead Pkwy', 'San Jose', 'CA', '95128');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(8, '472-27-2349', 'Dunhill', 'Curt', '707 938-6445', 'PO Box 792', 'Santa Clara', 'CA', '94301');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(9, '527-72-3246', 'Blue', 'Robert', '615 297-2723', '22 Cowboy Rd.', 'Nashville', 'TN', '37215');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(10, '172-32-1176', 'Black', 'John', '408 496-7223', '10932 Bigge Rd.', 'Menlo Park', 'CA', '94025');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(11, '724-08-9931', 'Lingenfelter', 'Daniel', '308 843-2991', '752 Telescope Rd.', 'Marietta', 'GA', '94609');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(12, '274-80-9391', 'Straight', 'Richard', '415 834-2919', '5420 University Av.', 'Oakland', 'CA', '94609');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(13, '756-30-7391', 'Karsen', 'Lynda', '415 534-9219', '72 James St.', 'Oakland', 'CA', '94609');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(14, '712-45-1867', 'Castillo', 'Jose', '615 996-8275', '28 Park Pl. #86', 'Ann Arbor', 'MI', '48105');");
//            statement.executeUpdate("INSERT INTO STUDENT VALUES(15, '846-92-7186', 'Hunter', 'Cindy', '415 836-7128', '41 Smart St.', 'Palo Alto', 'CA', '94301');");
//            
//            statement.executeUpdate("INSERT INTO TEACHER VALUES(1, '807-91-6654', 'Steiner', 'Lance', '301 946-8853', 'VMH2557', '3525 Gilboa Dr', 'Mount Airy', 'MD', '21771');");
//            statement.executeUpdate("INSERT INTO TEACHER VALUES(2, '899-46-2035', 'Harmen', 'Anne', '801 826-0752', 'AVW3256', '2157 5th Street', 'St. George', 'UT', '84152');");
//            statement.executeUpdate("INSERT INTO TEACHER VALUES(3, '486-29-1786', 'Lockley', 'Sharon', '415 585-4620', 'ARC2303', '18 Brooklyn Av.', 'San Francisco', 'CA', '94130');");
//            statement.executeUpdate("INSERT INTO TEACHER VALUES(4, '648-92-1872', 'Hall', 'Mark', '512 745-6402', 'KNI3343', '407 Orchard Lake Rd', 'Dublin', 'GA', '31021');");
//            statement.executeUpdate("INSERT INTO TEACHER VALUES(5, '341-22-1782', 'Allen', 'Paul', '206 843-0462', 'AVW3521', '6451 W Mercer Way', 'Mercer Island', 'WA', '98040');");
//            statement.executeUpdate("INSERT INTO TEACHER VALUES(6, '409-56-7008', 'Adams', 'Abraham', '703 658-9932', 'MAT2511', '4062 Tolers Ferry Rd', 'Huddleston', 'VA', '24104');");
//            statement.executeUpdate("INSERT INTO TEACHER VALUES(7, '213-46-8915', 'Blue', 'Maggie', '305 986-7020', 'SPH2474', '3010 N Bay Rd', 'Miami', 'FL', '33140');");
//            statement.executeUpdate("INSERT INTO TEACHER VALUES(8, '238-95-7766', 'Carson', 'Honey', '415 548-7723', 'CSS4511', '89 MLK Blvd.', 'Berkeley', 'CA', '94705');");
//            statement.executeUpdate("INSERT INTO TEACHER VALUES(9, '420-69-1738', 'Trump', 'Donald', '202 100-1000', 'PLS2241', '1600 Pennsylvania Ave', 'Washington', 'DC', '20001');");
//
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('UMD101', 'About UMD', 1, 'UMD', 'fall', 9);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('BMGT423A', 'Stock Market Prediction', 3, 'BMGT', 'spring', 5);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('PSYC411', 'Analyzing the Obsessive', 4, 'PSYC', 'fall', 4);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('BMGT105', 'Break-Even Analysis', 3, 'BMGT', 'fall', 1);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('PUBH465A', 'Food Science', 3, 'PUBH', 'spring', 7);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('PUBH498I', 'Nutritional Physiology', 4, 'PUBH', 'fall', 7);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('NUTR150', 'Twenty Meals you can make in 20 minutes', 1, 'NUTR', 'fall', 7);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('CMSC322', 'Usability Testing', 3, 'CMSC', 'spring', 2);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('BMGT438A', 'Quantitative Analysis for Managerial Decision Making', 3, 'BMGT', 'spring', 5);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('ARCH798H', 'Bridge and Tunnel Design for the Hyperloop', 4, 'ARCH', 'spring', 3);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('MATH340', 'Vector/Multivariable Calculus', 3, 'MATH', 'fall', 6);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('MECH424', 'Advanced Fluid Dynamics', 4, 'MECH', 'fall', 8);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('MECH325', 'Vibrations', 3, 'MECH', 'spring', 8);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('MECH255', 'Internal Combusiton Engine Design', 3, 'MECH', 'fall', 8);");
//            statement.executeUpdate("INSERT INTO COURSE (COURSE_ID, TITLE, CREDIT_COUNT, CATEGORY, SEMESTER, TEACHER_ID) VALUES('CMSC422', 'Machine Learning', 3, 'CMSC', 'spring', 2);");
//
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(1, 'UMD101');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(1, 'NUTR150');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(1, 'BMGT105');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(2, 'BMGT423A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(2, 'BMGT438A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(2, 'CMSC422');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(2, 'CMSC322');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(2, 'MATH340');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(3, 'ARCH798H');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(3, 'PUBH498I');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(3, 'MECH424');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(3, 'CMSC422');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(3, 'BMGT438A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(4, 'MECH424');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(4, 'MECH325');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(4, 'MECH255');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(4, 'PSYC411');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(4, 'BMGT105');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(5, 'CMSC422');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(5, 'CMSC322');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(5, 'BMGT105');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(5, 'BMGT438A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(5, 'NUTR150');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(6, 'BMGT105');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(6, 'CMSC422');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(6, 'PUBH498I');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(6, 'MECH255');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(6, 'CMSC322');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(7, 'BMGT438A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(7, 'BMGT423A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(7, 'UMD101');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(7, 'PSYC411');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(7, 'PUBH465A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(8, 'ARCH798H');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(8, 'NUTR150');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(8, 'MECH424');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(8, 'MECH325');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(8, 'MATH340');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(9, 'MECH255');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(9, 'BMGT423A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(9, 'MECH325');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(9, 'BMGT438A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(9, 'NUTR150');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(10, 'MATH340');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(10, 'BMGT105');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(10, 'MECH424');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(10, 'PSYC411');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(10, 'CMSC422');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(11, 'PUBH465A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(11, 'ARCH798H');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(11, 'PUBH498I');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(11, 'UMD101');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(11, 'CMSC322');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(12, 'BMGT105');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(12, 'PUBH465A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(12, 'PUBH498I');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(12, 'ARCH798H');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(12, 'MECH424');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(13, 'MATH340');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(13, 'UMD101');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(13, 'MECH325');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(13, 'NUTR150');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(13, 'BMGT438A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(14, 'BMGT423A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(14, 'CMSC422');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(14, 'CMSC322');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(14, 'PSYC411');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(14, 'BMGT105');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(15, 'CMSC322');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(15, 'CMSC422');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(15, 'BMGT438A');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(15, 'MECH424');");
//            statement.executeUpdate("INSERT INTO STUDENTCOURSE (U_ID, COURSE_ID) VALUES(15, 'NUTR150');");
//                        
//            System.out.println("Inserted records into the tables.");
//		} catch (SQLException se) {
//			se.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (statement != null)
//					connection.close();
//			} catch (SQLException se) {}
//			try {
//				if (connection != null)
//					connection.close();
//			} catch (SQLException se) {
//				se.printStackTrace();
//			}
//		}
//	}
}
