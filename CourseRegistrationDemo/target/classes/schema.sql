CREATE TABLE student (
  u_id number(9) NOT NULL,
  ssn varchar2(11) ,
  lastname varchar2(40)  NOT NULL,
  firstname varchar2(20)  NOT NULL,
  phone varchar2(12) ,
  address varchar2(40) ,
  city varchar2(20) ,
  state varchar2(2) ,
  zip varchar2(5) ,
  PRIMARY KEY (u_id)
) ;

CREATE TABLE  teacher (
  teacher_id number(9) NOT NULL,
  ssn varchar2(11) ,
  lastname varchar2(40)  NOT NULL,
  firstname varchar2(20)  NOT NULL,
  phone varchar2(12) ,
  office varchar2(7) ,
  address varchar2(40) ,
  city varchar2(20) ,
  state varchar2(2) ,
  zip varchar2(5) ,
  PRIMARY KEY (teacher_id)
) ;

CREATE TABLE  course (
  course_id varchar2(8) NOT NULL,
  title varchar2(80)  NOT NULL,
  credit_count number(1) ,
  category varchar2(4) ,
  semester varchar2(6) ,
  teacher_id number(9) NOT NULL ,
  PRIMARY KEY (course_id) ,
  FOREIGN KEY (teacher_id) REFERENCES teacher(teacher_id)
) ;

CREATE TABLE  studentcourse (
  u_id number(9) NOT NULL,
  course_id varchar2(8)  NOT NULL,
  PRIMARY KEY (u_id,course_id)
) ;