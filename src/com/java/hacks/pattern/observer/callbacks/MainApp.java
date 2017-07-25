package com.java.hacks.pattern.observer.callbacks;

import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) {
		Caller caller = new Caller();
		caller.registerAll(
			Arrays.asList(
				new CallBack() {
					@Override
					public void call() {
						System.out.println("Callback 1");
					}
				}, 
				() -> System.out.println("Callback 2"), 
				() -> {
					System.out.println("Callback 3");
				})
		);
		caller.execute();
	}
}
