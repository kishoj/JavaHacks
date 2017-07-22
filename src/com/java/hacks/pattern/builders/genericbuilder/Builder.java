package com.java.hacks.pattern.builders.genericbuilder;

@FunctionalInterface
public interface Builder <T> {
	T build();
}
