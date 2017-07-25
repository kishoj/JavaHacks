package com.java.hacks.pattern.annotations.exception;

@FunctionalInterface
public interface ExceptionListener {
	void onException(Throwable t);
}
