package com.java.hacks.pattern.builders.usinglambdas;

import java.util.function.Consumer;

import com.java.hacks.pattern.builders.setter.Person;

public class NestedIntefaceBuilder {
	
	public static Person build(Consumer<Person> block) {
		Person person = new Person();
		block.accept(person);
		return person;
	}
	
}
