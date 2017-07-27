package com.java.hacks.pattern.enums.interfaces.lambdas;

import java.math.BigDecimal;

public class OperationUtils {
	
	public static BigDecimal add(BigDecimal a, BigDecimal b) {
		return a.add(b);
	}
	
	public static BigDecimal sub(BigDecimal a, BigDecimal b) {
		return a.subtract(b);
	}
	
	public static BigDecimal mul(BigDecimal a, BigDecimal b) {
		return a.multiply(b);
	}
	
	public static BigDecimal div(BigDecimal a, BigDecimal b) {
		return a.divide(b);
	}
}
