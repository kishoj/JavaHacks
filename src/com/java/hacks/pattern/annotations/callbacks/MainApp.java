package com.java.hacks.pattern.annotations.callbacks;

public class MainApp {

	public static void main(String[] args) {
		Caller caller = new Caller();
		caller.register(TestCallBack.class);
	}

}
