package com.java.hacks.pattern.interfaces.multipleinheritance;

public class CancellableReservation implements Reservation, Cancellable {
	
	private Status status = Status.DRAFT;
	
	private CancellableReservation() { }
	
	public static CancellableReservation getReservationInstance() {
		return new CancellableReservation();
	}	
	
	public Status getStatus() {
		return status;
	}	

	private void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public void onReserve() {
		setStatus(Status.RESERVED);
		System.out.println("CancellableReservation::onReserve");
		printStatus();
	}
	
	@Override
	public void onCancel() {
		setStatus(Status.CANCELLED);
		System.out.println("CancellableReservation::onCancel");
		printStatus();
	}
	
	private void printStatus() {
		System.out.println("Booking Status: " + status);
	}

}