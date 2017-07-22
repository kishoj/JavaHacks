package com.java.hacks.pattern.builders.staticclass;

import java.util.Optional;

public class Person {
	
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	
	public Person() {}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	
	public static class Builder implements IBuilder<Person>{
		private Person person;
		
		private Optional<String> firstName = Optional.empty();
		private Optional<String> lastName = Optional.empty();
		private Optional<String> email = Optional.empty();
		private Optional<Integer> age = Optional.empty();
		
		public Builder() { 
			person = new Person();
		}
		
		public Builder firstName(String firstName) {
			this.firstName = Optional.ofNullable(firstName);
			return this;
		}
		
		public Builder lastName(String lastName) {
			this.lastName = Optional.ofNullable(lastName);
			return this;
		}
		
		public Builder email(String email) {
			this.email = Optional.ofNullable(email);
			return this;
		}
		
		public Builder age(int age) {
			this.age = Optional.ofNullable(Integer.valueOf(age));
			return this;
		}
		
		@Override
		public Person build() {
			person.setFirstName(firstName.isPresent() ? firstName.get() : null);
			person.setLastName(lastName.isPresent() ? lastName.get() : null);
			person.setEmail(email.isPresent() ? email.get() : null);
			person.setAge(age.isPresent() ? age.get().intValue() : 0);
			return person;
		}		
	}
	
}