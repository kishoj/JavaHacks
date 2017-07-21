package com.java.hacks.pattern.builders.classesonly;

import com.java.hacks.pattern.builders.staticclass.Person;

public class PersonBuilder {
	
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	
	public PersonBuilder() { }
	
	public PersonBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public PersonBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public PersonBuilder email(String email) {
		this.email = email;
		return this;
	}

	public PersonBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public Person build() {
		Person student = new Person();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setEmail(email);
		student.setAge(age);
		return student;
	}
}
