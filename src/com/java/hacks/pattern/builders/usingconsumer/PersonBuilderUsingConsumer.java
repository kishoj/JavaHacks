package com.java.hacks.pattern.builders.usingconsumer;

import java.util.function.Consumer;

import com.java.hacks.pattern.builders.setter.Person;

public class PersonBuilderUsingConsumer {

	public static Person build(Consumer<Person> consumer) {
		Person person = new Person();
		consumer.accept(person);
		return person;
	}

}
