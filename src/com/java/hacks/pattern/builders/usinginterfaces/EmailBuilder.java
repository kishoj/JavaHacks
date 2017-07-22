package com.java.hacks.pattern.builders.usinginterfaces;

@FunctionalInterface
public interface EmailBuilder {
	AgeBuilder email(String email);
}
