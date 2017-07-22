package com.java.hacks.pattern.annotation.exception;

public class ExceptionTest1 implements Caller {

	@Override
	@CatchGroup(
		catchers = {
			@Catch(targetCatchHandler = ExceptionHandler.class, targetException = ArithmeticException.class),
			@Catch(targetCatchHandler = ExceptionHandler.class, targetException = NullPointerException.class) 
		}
	)
	public void call() throws Throwable {
		int a = 0, b = 10;
		System.out.println(b / a);
	}

}
