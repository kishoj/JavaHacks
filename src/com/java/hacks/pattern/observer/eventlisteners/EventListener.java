package com.java.hacks.pattern.observer.eventlisteners;

@FunctionalInterface
public interface EventListener {
	void fireEvent (Event event);
}
