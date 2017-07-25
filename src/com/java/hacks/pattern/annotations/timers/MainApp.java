package com.java.hacks.pattern.annotations.timers;

public class MainApp {

	public static void main(String[] args) {
		TestClass testClass = new TestClass();
		testClass.test1();
		testClass.test2();		
		
		new TimerDecorator(
			() -> System.out.println("Logging test"))
		.logTime();
	}
}
