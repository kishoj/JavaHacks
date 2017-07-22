package com.java.hacks.pattern.builders.usinglambdas;

import com.java.hacks.pattern.builders.setter.Person;

@FunctionalInterface
public interface AgeBuilder {
	Person age(int age);
}
