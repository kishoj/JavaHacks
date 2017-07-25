package com.java.hacks.pattern.annotations.callbacks;

public class TestCallBack {
	@Callback
	public void methodToCallback1() {
		System.out.println("First Method");
	}

	@Callback
	public void methodToCallback12() {
		System.out.println("Another Method");
	}
}
