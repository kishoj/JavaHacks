package com.java.hacks.pattern.enums.statemachines;

public class MainApp {

	public static void main(String[] args) {
		System.out.println(Transition.from(State.QUOTATION, State.ORDER).toString());
		
		State.QUOTATION.getNextStates().forEach(System.out::println);		
		State.ORDER.getNextStates().forEach(System.out::println);
		
		State.QUOTATION.getTransitions().forEach(System.out::println);		
		State.ORDER.getTransitions().forEach(System.out::println);
		
		State.CANCELLED.getNextStates().forEach(System.out::println);
		State.CANCELLED.getTransitions().forEach(System.out::println);
	}

}
