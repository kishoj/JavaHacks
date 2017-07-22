package com.java.hacks.pattern.builders.usinglambdas;

import java.util.function.Consumer;

import com.java.hacks.pattern.builders.setter.Person;

public class MainApp {
	
	public static FirstNameBuilder person() {
	    return firstName -> lastName -> email -> age -> new Person(firstName, lastName, email, age);
	}
	
	public static NestedInteface personBuilder() {
		return () -> firstName -> lastName -> email -> age -> new Person(firstName, lastName, email, age);
	}
	
	public static Person build(Consumer<Person> block) {
		Person person = new Person();
		block.accept(person);
		return person;
	}

	public static void main(String[] args) {
		Person person = person()
							.firstName("Kishoj")							
							.lastName("Bajracharya")
							.email("kishoj@gmail.com")
							.age(31);
		
		System.out.println("Description of Person1");
		System.out.println("Full Name: " + person.getFirstName() + " " + person.getLastName());
		System.out.println("E-mail: " + person.getEmail());
		System.out.println("Age: " + person.getAge());	
		
		Person person2 = personBuilder().build()
				.firstName("Kishoj")
				.lastName("Bajracharya")
				.email("kishoj@gmail.com")
				.age(31);
		
		System.out.println("\nDescription of Person2");
		System.out.println("Full Name: " + person2.getFirstName() + " " + person2.getLastName());
		System.out.println("E-mail: " + person2.getEmail());
		System.out.println("Age: " + person2.getAge());

	
		Person person3 = NestedIntefaceBuilder.build(p -> {
			p.setFirstName("kishoj")
			.setLastName("Bajracharya")
			.setEmail("kishoj@gmail.com").setAge(31);
		});
		
		System.out.println("\nDescription of Person3");
		System.out.println("Full Name: " + person3.getFirstName() + " " + person3.getLastName());
		System.out.println("E-mail: " + person3.getEmail());
		System.out.println("Age: " + person3.getAge());
	}

}
