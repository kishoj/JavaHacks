package com.java.hacks.pattern.singleton;

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() { }
	
	public synchronized static Singleton getInstance() {
		return INSTANCE;
	}	
}
