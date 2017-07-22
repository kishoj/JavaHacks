package com.java.hacks.pattern.builders.genericbuilder;

public class Person {

	protected String firstName;
	protected String lastName;
	protected String email;
	protected int age;
	
	public Person() {}

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