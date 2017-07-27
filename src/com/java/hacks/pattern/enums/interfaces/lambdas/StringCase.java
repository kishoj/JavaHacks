package com.java.hacks.pattern.enums.interfaces.lambdas;

import java.util.function.Function;

public enum StringCase implements Function<String, String> {
	UPPER (s -> s.toUpperCase()),
	UPPERCASE (StringUtils::setToUpperCase),
	LOWER (s -> s.toLowerCase()),
	LOWERCASE (StringUtils::setToLowerCase);
	
	private final Function<String, String> function;
	
	private StringCase (final Function<String, String> function) {
		this.function = function;
	}

	@Override
	public String apply (String string) {
		return function.apply(string);
	}	
	
}