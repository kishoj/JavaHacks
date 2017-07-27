package com.java.hacks.pattern.enums.java8;

import java.util.List;

import com.java.hacks.pattern.enums.java8.State.Transition;

public interface StateMethod {
	List<State> getNextStates();
	List<Transition> getPossibleTransitions(); 
}
