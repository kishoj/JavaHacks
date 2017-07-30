package com.java.hacks.pattern.singleton.annotation;

public class MainApp {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		System.out.println("Instance 1: " + instance1.hashCode());
		System.out.println("Instance 2: " + instance2.hashCode());

		if (instance1.equals(instance2)) {
			System.out.println("Singleton property is valid");
		}
	}

}