package com.java.hacks.pattern.singleton;

public class MainApp {

	public static void main(String[] args) {
		Singleton object = Singleton.getInstance();
		System.out.println("First object instance: " + object.toString());
		System.out.println("Instance 1: " + object.hashCode());
		
		
		Singleton anotherObject = Singleton.getInstance();
		System.out.println("Second object instance: " + anotherObject.toString());
		System.out.println("Instance 2: " + anotherObject.hashCode());
		
		if (object.equals(anotherObject)) {
            System.out.println("Singleton Properties: Valid");
        } else {
        	System.out.println("Singleton Properties: Not Valid");
        }
	}

}
