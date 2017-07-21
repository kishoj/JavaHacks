package com.java.hacks.pattern.builders.interfaces;

public interface Builder<T> {
	T build();

	abstract Builder<T> log(String message);

	default String getName() {
		return "Builder";
	}
	
}