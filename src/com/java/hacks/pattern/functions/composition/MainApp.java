package com.java.hacks.pattern.functions.composition;

import java.math.BigDecimal;

public class MainApp {
	
	private final static BigDecimal MP = BigDecimal.valueOf(262.85);

	public static void main(String[] args) {
		Functional.getCostPriceByMarkPrice(MP);
		
		Product product = new Product();
		product.setName("Test Product");
		product.setMarkingPrice(MP);
		
		System.out.println(product.toString());
	}

}
