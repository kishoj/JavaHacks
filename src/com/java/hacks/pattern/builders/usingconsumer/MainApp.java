package com.java.hacks.pattern.builders.usingconsumer;

import com.java.hacks.pattern.builders.setter.Person;

public class MainApp {

	public static void main(String[] args) {

		Person person = PersonBuilderUsingConsumer.build(
			p -> {
					p.setFirstName("kishoj")
					 .setLastName("Bajracharya")
					 .setEmail("kishoj@gmail.com")
					 .setAge(31);
			}
		);
		
		System.out.println("Description of Person");
		System.out.println("Full Name: " + person.getFirstName() + " " + person.getLastName());
		System.out.println("E-mail: " + person.getEmail());
		System.out.println("Age: " + person.getAge());	
	}

}
