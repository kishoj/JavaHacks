package com.java.hacks.pattern.annotations.exception;

//Reference: https://stackoverflow.com/questions/19389808/using-annotations-for-exception-handling

public class MainApp {

	public static void main(String[] args) throws Exception {
		// Divide by zero test
		ExceptionTest1 test = new ExceptionTest1();
		MethodCaller.call(test);
		
		// Null Pointer Exception test
		ExceptionTest2 test2 = new ExceptionTest2();
		MethodCaller.call(test2);
	}

}