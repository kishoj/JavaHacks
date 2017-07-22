package com.java.hacks.pattern.builders.usinglambdas;

@FunctionalInterface
public interface LastNameBuilder {
	EmailBuilder lastName(String lastName);
}
