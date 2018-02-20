package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="STUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="u_id")
	public Integer u_id;
	
	@Column(name="ssn")
	public String ssn;
	
	@Column(name="lastname")
	public String lastname;
	
	@Column(name="firstname")
	public String firstname;
	
	@Column(name="phone")
	public String phone;
	
	@Column(name="address")
	public String address;
	
	@Column(name="city")
	public String city;
	
	@Column(name="state")
	public String state;
	
	@Column(name="zip")
	public String zip;
	
	public Student() {
		super();
		this.u_id = null;
		this.ssn = null;
		this.lastname = null;
		this.firstname = null;
		this.phone = null;
		this.address = null;
		this.city = null;
		this.state = null;
		this.zip = null;
	}

	public Student(Integer u_id, String lastname, String firstname) {
		super();
		this.u_id = u_id;
		this.ssn = null;
		this.lastname = lastname;
		this.firstname = firstname;
		this.phone = null;
		this.address = null;
		this.city = null;
		this.state = null;
		this.zip = null;
	}
	
	public Student(Integer u_id, String ssn, String lastname, String firstname, String phone, String address, String city,
			String state, String zip) {
		super();
		this.u_id = u_id;
		this.ssn = ssn;
		this.lastname = lastname;
		this.firstname = firstname;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
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
		return "Student [u_id=" + u_id + ", ssn=" + ssn + ", lastname=" + lastname + ", firstname=" + firstname
				+ ", phone=" + phone + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ "]";
	}
}
