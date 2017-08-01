package com.java.hacks.pattern.functions.composition;

import java.math.BigDecimal;

public class Product {
	
	private String name;
	private BigDecimal costPrice;
	private BigDecimal profit;
	private BigDecimal sellingPrice;
	private BigDecimal markingPrice;
	private BigDecimal discount;
	private BigDecimal vat;
	
	Product() { }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	private void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public BigDecimal getSellingPrice() {
		return sellingPrice;
	}

	private void setSellingPrice(BigDecimal sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public BigDecimal getMarkingPrice() {
		return markingPrice;
	}

	public void setMarkingPrice(BigDecimal markingPrice) {
		this.markingPrice = markingPrice;
		BigDecimal taxablePrice = Functional.discount.apply(markingPrice);
		setDiscount(markingPrice.subtract(taxablePrice));
		BigDecimal sellablePrice = Functional.vat.apply(taxablePrice);
		setVat(sellablePrice.subtract(taxablePrice));
		setSellingPrice(sellablePrice);
		BigDecimal costPriceValue = Functional.removeProfit.apply(sellablePrice);
		BigDecimal profitValue = sellablePrice.subtract(costPriceValue);
		setProfit(profitValue);
		setCostPrice(costPriceValue);
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	private void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getVat() {
		return vat;
	}

	private void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", costPrice=" + costPrice + ", profit=" + profit + ", sellingPrice="
				+ sellingPrice + ", markingPrice=" + markingPrice + ", discount=" + discount + ", vat=" + vat + "]";
	}	
	
}