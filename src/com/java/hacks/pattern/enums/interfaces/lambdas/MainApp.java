package com.java.hacks.pattern.enums.interfaces.lambdas;

import java.math.BigDecimal;

public class MainApp {

	public static void main(String[] args) {
		System.out.println(Operation.PLUS.apply(BigDecimal.ONE, BigDecimal.TEN));
		System.out.println(Operation.ADD.apply(BigDecimal.ONE, BigDecimal.TEN));
		System.out.println(StringCase.UPPER.apply("kishoj"));
		System.out.println(StringCase.UPPERCASE.apply("kishoj"));
	}

}
