package com.java.hacks.pattern.builders.usinglambdas;

@FunctionalInterface
public interface FirstNameBuilder {
	LastNameBuilder firstName(String firstName);
}
