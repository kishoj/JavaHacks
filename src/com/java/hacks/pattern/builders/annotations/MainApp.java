package com.java.hacks.pattern.builders.annotations;

import java.lang.annotation.Annotation;
import java.util.Optional;

public class MainApp {

	public static void main(String[] args) {
		Optional<Person> maybePerson = getPersonByClass(Person.class);
		if (maybePerson.isPresent()) {
			Person person = maybePerson.get();
			
			System.out.println("Description of Person");
			System.out.println("Full Name: " + person.getFirstName() + " " + person.getLastName());
			System.out.println("E-mail: " + person.getEmail());
			System.out.println("Age: " + person.getAge());	
		}		
	}

	private static Optional<Person> getPersonByClass(Class<Person> object) {
		Optional<Person> maybePerson = Optional.empty();
		if (object.isAnnotationPresent(PersonBuilder.class)) {
			Annotation annotation = object.getAnnotation(PersonBuilder.class);
			maybePerson = Optional.ofNullable(mapPersonBuilderToPerson((PersonBuilder) annotation));
		}
		return maybePerson;
	}

	private static Person mapPersonBuilderToPerson(PersonBuilder specificPerson) {
		Person person = null;
		if (specificPerson != null) {
			person = new Person();
			person.setFirstName(specificPerson.firstName());
			person.setLastName(specificPerson.lastName());
			person.setEmail(specificPerson.email());
			person.setAge(specificPerson.age());
		}
		return person;
	}

}