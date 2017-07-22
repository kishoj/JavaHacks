package com.java.hacks.pattern.builders.usinglambdas;

import com.java.hacks.pattern.builders.common.Person;

public class MainApp {

	public static void main(String[] args) {
		Person person = LambdaPersonBuilder.build(
				            p -> p.setFirstName("Kishoj"),
				            p -> p.setLastName("Bajracharya"),
				            p -> p.setEmail("kishoj@gmail.com"),
				            p -> p.setAge(31)
				          );
		
		System.out.println("Description of Person1");
		System.out.println("Full Name: " + person.getFirstName() + " " + person.getLastName());
		System.out.println("E-mail: " + person.getEmail());
		System.out.println("Age: " + person.getAge());	
		
		Person person2 = LambdaPersonBuilder.build(
				p -> p.setFirstName("Kishoj")
						.setLastName("Bajracharya")
						.setEmail("kishoj@gmail.com")
						.setAge(31)
	          );
		
		System.out.println("Description of Person2");
		System.out.println("Full Name: " + person2.getFirstName() + " " + person2.getLastName());
		System.out.println("E-mail: " + person2.getEmail());
		System.out.println("Age: " + person2.getAge());	
	}

}
