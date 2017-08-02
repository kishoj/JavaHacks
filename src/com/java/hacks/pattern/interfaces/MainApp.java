package com.java.hacks.pattern.interfaces;

import java.util.Arrays;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		List<Messenger> messengers = Arrays.asList(
										new FaceBookMessenger(), 
										new LineMessenger(),
										() -> System.out.println("Message send via Unknown Messenger")
									);
		messengers
			.forEach(Messenger::send);
	}

}
