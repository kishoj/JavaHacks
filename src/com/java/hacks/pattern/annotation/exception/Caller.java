package com.java.hacks.pattern.annotation.exception;

@FunctionalInterface
public interface Caller {
	void call() throws Throwable;
}
