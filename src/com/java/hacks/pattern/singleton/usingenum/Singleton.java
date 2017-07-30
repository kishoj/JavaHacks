package com.java.hacks.pattern.singleton.usingenum;

public enum Singleton {
	INSTANCE;
	
	Singleton() {
		System.out.println("Singleton enum example");
	}
	
	public static Singleton getInstance() {
        return INSTANCE;
    }
	
	void method() {
		System.out.println("Singleton::method");
	}
}
