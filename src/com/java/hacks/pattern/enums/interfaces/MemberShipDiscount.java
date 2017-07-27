package com.java.hacks.pattern.enums.interfaces;

import java.math.BigDecimal;

public interface MemberShipDiscount extends Discount {
	
	static Discount getDiscountFor(MemberShipType memberShip) {
		switch(memberShip) {
			case SILVER: return amount -> amount.multiply(BigDecimal.valueOf(0.9));
			case GOLD: return amount -> amount.multiply(BigDecimal.valueOf(0.8));
			case PLATINUM: return amount -> amount.multiply(BigDecimal.valueOf(0.7));
		}
		return amount -> amount;
    }
}
