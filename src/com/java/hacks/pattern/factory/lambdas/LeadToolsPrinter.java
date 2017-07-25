package com.java.hacks.pattern.factory.lambdas;

public class LeadToolsPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("Printed using LEADTOOLS API.");
	}
}