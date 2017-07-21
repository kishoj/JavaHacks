package com.java.hacks.pattern.builders.classes;

public interface Person {
	String firstName();
	String lastName();
	String email();
	int age();
	
	// Class inside an interface 
	class Builder extends PersonBuilder {};
}
