package com.demo.crudapp.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
public class CandidateDetails {
	@Id
	private int rollNo;
	private String firstName;
	private String lastName;
	private String qualification;
	private String address;
	private long phoneNo;
	private int age;
	
	public CandidateDetails() {
		
	}
	
	public CandidateDetails(int rollNo,String firstName, String lastName, String qualification,String address,long phoneNo, int age) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.qualification = qualification;
		this.address = address;
		this.phoneNo = phoneNo;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
