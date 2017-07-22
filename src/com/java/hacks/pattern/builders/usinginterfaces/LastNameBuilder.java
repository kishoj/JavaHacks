package com.java.hacks.pattern.builders.usinginterfaces;

@FunctionalInterface
public interface LastNameBuilder {
	EmailBuilder lastName(String lastName);
}
