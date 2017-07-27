package com.java.hacks.pattern.enums.statemachines;

import java.util.List;

public interface Statable<STATE, TRANSITION> {
	public List<STATE> getNextStates();
	public List<TRANSITION> getTransitions();
}
