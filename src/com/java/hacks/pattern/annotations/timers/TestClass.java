package com.java.hacks.pattern.annotations.timers;

public class TestClass {
	
	public TestClass() {
		// Using Interface
		MethodInterceptor.processAnnotations(this);
		
		// Using class
		//TimerAnnotationHandler.processAnnotations(this);
	}
	
	@Timer(set = true)
	public void test1() {
		System.out.println("Test1: Enabled Timer Annotation");
	}
	
	@Timer(set = false)
	public void test2() {
		System.out.println("Test2: Disabled Timer Annotation");
	}
}
