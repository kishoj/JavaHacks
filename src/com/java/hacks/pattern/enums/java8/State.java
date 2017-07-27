package com.java.hacks.pattern.enums.java8;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public enum State implements StateMethod {
	S1, S2, S3;

	public enum Transition {
		T1(S1, S1), T2(S1, S2), T3(S1, S3), T4(S2, S2), T5(S3, S3);

		private State fromState;
		private State toState;

		private Transition(State fromState, State toState) {
			this.fromState = fromState;
			this.toState = toState;
		}

		private static final Map<State, Map<State, Transition>> m = new EnumMap<State, Map<State, Transition>>(
				State.class);
		static {
			for (State p : State.values())
				m.put(p, new EnumMap<State, Transition>(State.class));
			for (Transition trans : Transition.values())
				m.get(trans.fromState).put(trans.toState, trans);
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

	@Override
	public List<State> getNextStates() {
		return Transition.getNextStates(this);
	}

	@Override
	public List<Transition> getPossibleTransitions() {
		return Transition.getTransitions(this);
	}

}
