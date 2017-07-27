package com.java.hacks.pattern.enums.eventlisteners;

public enum State implements EventListener {
	
	UNDEFINED, 
	INITIAL, 
	INTERMEDIATE, 
	FINAL;

	public State nextState() {
		switch (this) {
			case INITIAL: return INTERMEDIATE;
			case INTERMEDIATE: return FINAL;
			case FINAL: return UNDEFINED;
			case UNDEFINED: 
			default: return UNDEFINED;
		}		
	}

	@Override
	public void onEvent(Event event) {
		nextState();
	}

}
