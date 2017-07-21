package com.java.hacks.pattern.builders.classesonly;

import com.java.hacks.pattern.builders.staticclass.Person;

public class MainApp {

	public static void main(String[] args) {
		Person person = new PersonBuilder()
				.firstName("Kishoj")
				.lastName("Bajracharya")
				.email("kishoj@gmail.com")
				.age(31)
				.build();

		System.out.println("Description of Person");
		System.out.println("Full Name: " + person.getFirstName() + " " + person.getLastName());
		System.out.println("E-mail: " + person.getEmail());
		System.out.println("Age: " + person.getAge());		
	}

}
