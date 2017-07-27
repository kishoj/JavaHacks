package com.java.hacks.pattern.enums.eventlisteners;

public class StateMachine implements EventListener {
	
	private State currentState = State.INITIAL;

	@Override
	public void onEvent(Event event) {
		System.out.println("Event Received " + event.getState().toString());		
		currentState = currentState.nextState();
	}

	public State getCurrentState() {
		return currentState;
	}
	
}
