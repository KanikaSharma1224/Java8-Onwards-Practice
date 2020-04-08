package com.practice.lambda;

public class Employee {
	private String fName;
	private String lName;
	private int age;
	private String designation;

	public Employee(String fName, String lName, int age, String designation) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public String getFName() {
		return fName;
	}

	public String getLName() {
		return lName;
	}

	public String getDesignation() {
		return designation;
	}

	public String toString() {
		return designation + " " + fName + " " + lName + " has " + age + " age.";
	}

}
