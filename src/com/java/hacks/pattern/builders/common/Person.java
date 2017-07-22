package com.java.hacks.pattern.builders.common;

public class Person {

	protected String firstName;
	protected String lastName;
	protected String email;
	protected int age;
	
	public Person() {}
	
	public Person(String firstName, String lastName, String email, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setAge(age);
	}

	public String getFirstName() {
		return firstName;
	}

	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Person setEmail(String email) {
		this.email = email;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

}