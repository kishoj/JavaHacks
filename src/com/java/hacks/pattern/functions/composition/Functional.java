package com.java.hacks.pattern.functions.composition;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;

public class Functional {
	
	private static final double PROFIT_RATE = 0.5;
	private static final double DISCOUNT_RATE = 0.2;
	private static final double VAT_RATE = 0.07;
	
	public static Function<BigDecimal, BigDecimal> discount = markPrice -> {
		System.out.println("Marked Price: " + markPrice.toString());		
		BigDecimal discountedRate =  markPrice
				.multiply(BigDecimal.ONE.subtract(BigDecimal.valueOf(DISCOUNT_RATE)))
				.setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal discountValue = markPrice.multiply(BigDecimal.valueOf(DISCOUNT_RATE))
				.setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("Discount: " + discountValue.toString());		
		return discountedRate;
	};
			
	public static Function<BigDecimal, BigDecimal> vat = discountedRate -> {
		System.out.println("Price After Discount: " + discountedRate.toString());				
		BigDecimal sellingPrice = discountedRate
				.multiply(BigDecimal.ONE.add(BigDecimal.valueOf(VAT_RATE)))
				.setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal vatValue = discountedRate.multiply(BigDecimal.valueOf(VAT_RATE))
				.setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("VAT: " + vatValue.toString());		
		return sellingPrice;
	};

	public static Function<BigDecimal, BigDecimal> removeProfit = sellingPrice -> {
		System.out.println("Selling Price: " + sellingPrice.toString());		
		BigDecimal costPrice =	sellingPrice
				.divide(BigDecimal.ONE.add(BigDecimal.valueOf(PROFIT_RATE)), 15, RoundingMode.HALF_EVEN)
				.setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal profitValue = sellingPrice.subtract(costPrice)
					.setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("Profit: " + profitValue.toString());		
		System.out.println("Cost Price: " + costPrice.toString());
		return costPrice;
	};
	
	public static Function<BigDecimal, BigDecimal> removeVat = sellingPrice -> {
		System.out.println("Selling Price: " + sellingPrice.toString());		
		BigDecimal costPrice =	sellingPrice
				.divide(BigDecimal.ONE.add(BigDecimal.valueOf(PROFIT_RATE)), 15, RoundingMode.HALF_EVEN)
				.setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal profitValue = sellingPrice.subtract(costPrice)
					.setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("Profit: " + profitValue.toString());		
		System.out.println("Cost Price: " + costPrice.toString());
		return costPrice;
	};
	
	public static Function<BigDecimal, BigDecimal> addProfit = costPrice -> {
		System.out.println("Cost Price: " + costPrice.toString());		
		BigDecimal sellingPrice = costPrice.multiply(BigDecimal.ONE.add(BigDecimal.valueOf(PROFIT_RATE)))
				.setScale(2, RoundingMode.HALF_EVEN);		
		BigDecimal profitValue = sellingPrice.subtract(costPrice)
				.setScale(2, RoundingMode.HALF_EVEN);  
		System.out.println("Profit: " + profitValue.toString());
		return costPrice;
	};
	
	public static BigDecimal getCostPriceByMarkPrice(BigDecimal markPrice) {
		return discount.andThen(vat).andThen(removeProfit).apply(markPrice);
	}
	
	public static BigDecimal getMarkedPriceByCostPrice(BigDecimal costPrice) {
		//return addProfit.andThen(removeVat)
		return null;
	}
}
