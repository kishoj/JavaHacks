package com.java.hacks.pattern.builders.extendclass;

public class MainApp {

	public static void main(String[] args) {
		Person person = ((PersonBuilder) new PersonBuilder()
							.setFirstName("Kishoj")
							.setLastName("Bajracharya")
							.setEmail("kishoj@gmail.com")
							.setAge(31)).build();
							
		System.out.println("Description of Person");
		System.out.println("Full Name: " + person.getFirstName() + " " + person.getLastName());
		System.out.println("E-mail: " + person.getEmail());
		System.out.println("Age: " + person.getAge());	
	}

}
