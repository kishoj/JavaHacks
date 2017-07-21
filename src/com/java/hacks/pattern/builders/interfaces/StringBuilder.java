package com.java.hacks.pattern.builders.interfaces;

public class StringBuilder implements Builder<String> {
	private final String EMPTY = "";
	private final String SPACE = " ";
	private final String NEW_LINE = "\n";

	private String string;

	public StringBuilder() {
		this.string = EMPTY;
	}

	public StringBuilder(String string) {
		this.string = string;
	}

	public StringBuilder append(String string) {
		if (string != null) {
			this.string += string;
		}
		return this;
	}

	public StringBuilder addSpace() {
		if (this.string != null) {
			this.string = this.string + SPACE;
		}
		return this;
	}

	public StringBuilder addNewLine() {
		if (this.string != null) {
			this.string = this.string + NEW_LINE;
		}
		return this;
	}

	@Override
	public String build() {
		return this.string;
	}

	@Override
	public StringBuilder log(String message) {
		System.out.println("Message: " + message);
		return this;
	}

	@Override
	public String getName() {
		return "StringBuilder inside Class";
	}

}