package com.java.hacks.pattern.interfaces.multipleinheritance;

public interface Reservation {
	void onReserve();
	
	default void reserve() {
		System.out.println("Reservation::reserve");
		onReserve();
	}
}
