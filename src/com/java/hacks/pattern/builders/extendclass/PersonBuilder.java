package com.java.hacks.pattern.builders.extendclass;

import com.java.hacks.pattern.builders.classes.Builder;

public class PersonBuilder extends Person implements Builder<Person> {

	@Override
	public Person build() {
		return this;
	}
}
