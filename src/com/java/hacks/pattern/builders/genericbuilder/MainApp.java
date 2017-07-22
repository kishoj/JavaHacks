package com.java.hacks.pattern.builders.genericbuilder;

import com.java.hacks.pattern.builders.common.Person;

public class MainApp {

	public static void main(String[] args) {
		Person person = GenericBuilder.of(Person::new)
	            			.with(Person::setFirstName, "Kishoj")
	            			.with(Person::setLastName, "Bajracharya")
	            			.with(Person::setEmail, "kishoj@gmail.com")
	            			.with(Person::setAge, 31)
	            			.build();
		
		System.out.println("Description of Person");
		System.out.println("Full Name: " + person.getFirstName() + " " + person.getLastName());
		System.out.println("E-mail: " + person.getEmail());
		System.out.println("Age: " + person.getAge());	
	}

}
