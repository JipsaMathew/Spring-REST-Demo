package com.endurance.springdemo.entity;

/*
 pojo class
 */

public class Student {
	String firstName, lastName, major;
	int stuId, credits;

	public Student() {
		
	}

	public Student(String firstName, String lastName, String major, int credits) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.credits = credits;
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}	
	
}
