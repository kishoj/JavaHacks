package com.java.hacks.pattern.enums.statemachines;

import java.util.List;

public enum State implements Statable<State, Transition> {
	
	QUOTATION, 
	ORDER, 
	APPROVED, 
	CANCELLED;

	@Override
	public List<State> getNextStates() {
		return Transition.getNextStates(this);
	}

	@Override
	public List<Transition> getTransitions() {
		return Transition.getTransitions(this);
	}

}
