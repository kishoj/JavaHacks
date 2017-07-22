package com.java.hacks.pattern.builders.usinglambdas;

@FunctionalInterface
public interface EmailBuilder {
	AgeBuilder email(String email);
}
