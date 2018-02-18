package com.example.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	public Integer teacher_id;
	public String ssn;
	public String lastname;
	public String firstname;
	public String phone;
	public String office;
	public String address;
	public String city;
	public String state;
	public String zip;
	
	public Teacher() {
		super();
		this.teacher_id = null;
		this.ssn = null;
		this.lastname = null;
		this.firstname = null;
		this.phone = null;
		this.office = null;
		this.address = null;
		this.city = null;
		this.state = null;
		this.zip = null;
	}

	public Teacher(Integer teacher_id, String lastname, String firstname) {
		super();
		this.teacher_id = teacher_id;
		this.ssn = null;
		this.lastname = lastname;
		this.firstname = firstname;
		this.phone = null;
		this.office = null;
		this.address = null;
		this.city = null;
		this.state = null;
		this.zip = null;
	}
	
	public Teacher(Integer teacher_id, String ssn, String lastname, String firstname, String phone, String office,
			String address, String city, String state, String zip) {
		super();
		this.teacher_id = teacher_id;
		this.ssn = ssn;
		this.lastname = lastname;
		this.firstname = firstname;
		this.phone = phone;
		this.office = office;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Integer getTeacher_id() {
		return teacher_id;
	}
	
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "Teacher [u_id=" + teacher_id + ", ssn=" + ssn + ", lastname=" + lastname + ", firstname=" + firstname
				+ ", phone=" + phone + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ "]";
	}
}
