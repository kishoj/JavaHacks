package com.java.hacks.pattern.interfaces.multipleinheritance;

public interface Cancellable {
	void onCancel();
	
	default void cancel() {
		System.out.println("Cancellable::cancel");
		onCancel();
	}
}
