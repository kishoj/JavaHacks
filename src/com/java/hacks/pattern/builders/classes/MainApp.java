package com.java.hacks.pattern.builders.classes;

public class MainApp {

	public static void main(String[] args) {
		Person person = new Person.Builder()
								.firstName("Kishoj")
								.lastName("Bajracharya")
								.email("kishoj@gmail.com")
								.age(31)
								.build();
		
		System.out.println("Description of Person");
		System.out.println("Full Name: " + person.firstName() + " " + person.lastName());
		System.out.println("E-mail: " + person.email());
		System.out.println("Age: " + person.age());		
	}
	
}
