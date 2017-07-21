package com.java.hacks.pattern.builders.interfaces;

public class MainApp {

	public static void main(String[] args) {
		String result = new StringBuilder("Full Name:")
								.addSpace()
								.append("Kishoj")
								.addSpace()
								.append("Bajracharya")
								.addNewLine()
								.append("Email:")
								.addSpace()
								.append("kishoj@gmail.com")
								.log("Testing Custom StringBuilder").build();

		System.out.println(result);
		System.out.println(new StringBuilder().getName());
	}

}