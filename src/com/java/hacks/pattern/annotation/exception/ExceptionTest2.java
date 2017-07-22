package com.java.hacks.pattern.annotation.exception;

public class ExceptionTest2 implements Caller {

	private String test;

	@Override
	@CatchGroup(
		catchers = {
			@Catch(targetCatchHandler = ExceptionHandler.class, targetException = ArithmeticException.class),
			@Catch(targetCatchHandler = ExceptionHandler.class, targetException = NullPointerException.class) 
		}
	)
	public void call() throws Throwable {
		test = null;
		System.out.println(test.length());
	}

}
