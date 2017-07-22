package com.java.hacks.pattern.builders.usinginterfaces;

@FunctionalInterface
public interface FirstNameBuilder {
	LastNameBuilder firstName(String firstName);
}
