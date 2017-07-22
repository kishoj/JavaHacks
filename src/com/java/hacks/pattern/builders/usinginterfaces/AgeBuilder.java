package com.java.hacks.pattern.builders.usinginterfaces;

import com.java.hacks.pattern.builders.common.Person;

@FunctionalInterface
public interface AgeBuilder {
	Person age(int age);
}
