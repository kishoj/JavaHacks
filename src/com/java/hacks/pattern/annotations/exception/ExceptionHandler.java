package com.java.hacks.pattern.annotations.exception;

public class ExceptionHandler implements ExceptionListener {

	@Override
	public void onException(Throwable exception) {
		System.out.println("ExceptionHandler.onException");
		System.out.println("Exception caught: " + exception.getMessage());
	}
	
}
