package com.java.hacks.pattern.enums.interfaces;

import java.math.BigDecimal;

public enum MemberShipType implements MemberShipDiscount {
	SILVER {
		@Override
		public BigDecimal getMemberShipRate() {
			return BigDecimal.valueOf(0.9);
		}
	}, 
	GOLD {
		@Override
		public BigDecimal getMemberShipRate() {
			return BigDecimal.valueOf(0.8);
		}
	}, 
	PLATINUM {		
		// This will override the enum-level version 
		public BigDecimal getSpecialPrice(final BigDecimal amount) {
			return amount.multiply(BigDecimal.valueOf(0.95));			
		}

		@Override
		public BigDecimal getMemberShipRate() {
			return BigDecimal.valueOf(0.7);
		}
	};
	
	
	// method is abstract so each enum has to implement it.
	public abstract BigDecimal getMemberShipRate();
	
	// Enum-level version of getSpecialPrice
	public BigDecimal getSpecialPrice(final BigDecimal amount) {
		if (this.equals(PLATINUM)) {
			return amount.multiply(BigDecimal.valueOf(0.95));	
		} else {
			return amount;
		}
	}
	
	@Override
	public BigDecimal apply(BigDecimal amount) {
		switch (this) {
			case SILVER:
				return amount.multiply(BigDecimal.valueOf(0.9));
			case GOLD:
				return amount.multiply(BigDecimal.valueOf(0.8));
			case PLATINUM:
				return amount.multiply(BigDecimal.valueOf(0.7));
		}
		return amount.multiply(BigDecimal.valueOf(0.1));
	}

}
