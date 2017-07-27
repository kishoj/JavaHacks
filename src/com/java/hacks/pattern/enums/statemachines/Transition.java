package com.java.hacks.pattern.enums.statemachines;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public enum Transition {
	
	CONFIRM (State.QUOTATION, State.ORDER), 
	CANCEL (State.QUOTATION, State.CANCELLED), 
	APPROVE (State.ORDER, State.APPROVED), 
	CANCEL_APPROVE (State.ORDER, State.CANCELLED);

	private State initialState;
	private State finalState;

	private Transition(State initialState, State finalState) {
		this.initialState = initialState;
		this.finalState = finalState;
	}

	private static final Map<State, Map<State, Transition>> m = new EnumMap<State, Map<State, Transition>>(
			State.class);
	static {
		for (State p : State.values())
			m.put(p, new EnumMap<State, Transition>(State.class));
		for (Transition trans : Transition.values())
			m.get(trans.initialState).put(trans.finalState, trans);
	}

	public static Transition from(State src, State dst) {
		return m.get(src).get(dst);
	}

	public static List<State> getNextStates(State state) {
		return m.get(state).entrySet().stream().map(s -> s.getKey())
				.collect(Collectors.toList());
	}

	public static List<Transition> getTransitions(State state) {
		return m.get(state).entrySet().stream().map(s -> s.getValue())
				.collect(Collectors.toList());
	}
	
}
