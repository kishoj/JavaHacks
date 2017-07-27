package com.java.hacks.pattern.enums.interfaces.lambdas;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public enum Operation implements BiFunction<BigDecimal, BigDecimal, BigDecimal> {
	ADD ((a, b) -> a.add(b)),
	SUBTRACT ((a, b) -> a.subtract(b)),
	MULTIPLY ((a, b) -> a.multiply(b)),
	DIVIDE ((a, b) -> a.divide(b)),
	
	PLUS (OperationUtils::add),
	MINUS (OperationUtils::sub),
	CROSS (OperationUtils::mul),
	DIV (OperationUtils::div);
	
    private final BiFunction<BigDecimal, BigDecimal, BigDecimal> binaryOperator;

    // Private Constructor
    private Operation(final BiFunction<BigDecimal, BigDecimal, BigDecimal> binaryOperator) {
        this.binaryOperator = binaryOperator;
    }

	@Override
	public BigDecimal apply(BigDecimal t, BigDecimal u) {
		return binaryOperator.apply(t, u);
	}

}