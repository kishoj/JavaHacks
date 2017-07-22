package com.java.hacks.pattern.builders.usinginterfaces;

import java.util.function.Consumer;

import com.java.hacks.pattern.builders.common.Person;

public class NestedIntefaceBuilder {
	
	public static Person build(Consumer<Person> block) {
		Person person = new Person();
		block.accept(person);
		return person;
	}
	
}
