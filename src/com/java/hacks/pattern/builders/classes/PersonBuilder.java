package com.java.hacks.pattern.builders.classes;

public class PersonBuilder implements Builder<Person> {
	
	private String firstName;
	private String lastName;
	private String email;
	private int age;

	public PersonBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public PersonBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public PersonBuilder email(String email) {
		this.email = email;
		return this;
	}

	public PersonBuilder age(int age) {
		this.age = age;
		return this;
	}

	@Override
	public Person build() {
		return new Person() {
			@Override
			public String firstName() {
				return firstName;
			}

			@Override
			public String lastName() {
				return lastName;
			}

			@Override
			public String email() {
				return email;
			}

			@Override
			public int age() {
				return age;
			}
		};
	}

}
