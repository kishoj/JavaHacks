package com.java.hacks.pattern.enums.interfaces;

import java.math.BigDecimal;

public interface Discount {
	BigDecimal apply(BigDecimal amount);
	
	static Discount christmasDiscount() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.9));
    }
	
	static Discount newYearDiscount() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.8));
    }
 
    static Discount halloweenDiscount() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.7));
    }
}
