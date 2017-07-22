package com.java.hacks.pattern.annotation.exception;

@FunctionalInterface
public interface ExceptionListener {
	void onException(Throwable t);
}
