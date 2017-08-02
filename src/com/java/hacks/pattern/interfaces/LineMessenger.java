package com.java.hacks.pattern.interfaces;

public class LineMessenger implements Messenger {

	@Override
	public void send() {
		System.out.println("Line Message send via Line Messenger");
	}

}
