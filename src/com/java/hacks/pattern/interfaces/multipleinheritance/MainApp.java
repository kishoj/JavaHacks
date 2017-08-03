package com.java.hacks.pattern.interfaces.multipleinheritance;

public class MainApp {

	public static void main(String[] args) {
		CancellableReservation reservation = CancellableReservation.getReservationInstance();
		System.out.println("Initial Booking status: " + reservation.getStatus());
		
		System.out.println("\n--------------- On Reservation ------------");
		reservation.reserve();
		
		System.out.println("\n-------------- On Cancel ------------");
		reservation.cancel();
	}

}
