package com.java.hacks.pattern.enums.eventlisteners;

public class MainApp {

	public static void main(String[] args) {
		StateMachine machine = new StateMachine();
		
		System.out.println(machine.getCurrentState().toString());
		machine.onEvent(new Event("Transition from INITIAL to INTERMEDIATE", State.INTERMEDIATE));
		System.out.println(machine.getCurrentState().toString());
		machine.onEvent(new Event("Transition from INTERMEDIATE to FINAL", State.FINAL));
		System.out.println(machine.getCurrentState().toString());
	}

}
