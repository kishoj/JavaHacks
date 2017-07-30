package com.java.hacks.pattern.enums.java8;

public class MainApp {

	public static void main(String[] args) {
		State.S1.getNextStates()
				.forEach(System.out::println);
		
		State.S2.getNextStates()
		.forEach(System.out::println);
		
		State.S3.getNextStates()
		.forEach(System.out::println);
		
		
		State.S1.getPossibleTransitions()
			.forEach(System.out::println);
		
		State.S2.getPossibleTransitions()
		.forEach(System.out::println);
		
		State.S3.getPossibleTransitions()
		.forEach(System.out::println);
	}

}
