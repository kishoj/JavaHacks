package com.java.hacks.pattern.observer.callbacks;

import java.util.ArrayList;
import java.util.List;

public class Caller {
	
	private List<CallBack> callbacks = new ArrayList<>();
	
	public void register(CallBack callback) {
		callbacks.add(callback);
	}
	
	public void execute() {
		if (!callbacks.isEmpty()) {
			callbacks.forEach(callback -> callback.call());
		}
	}

	public void registerAll(List<CallBack> callbacks2) {
		callbacks.addAll(callbacks2);
	}
}
