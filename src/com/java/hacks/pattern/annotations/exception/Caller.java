package com.java.hacks.pattern.annotations.exception;

@FunctionalInterface
public interface Caller {
	void call() throws Throwable;
}
