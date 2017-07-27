package com.java.hacks.pattern.enums.interfaces;

import java.math.BigDecimal;

public class MainApp {

	public static void main(String[] args) {
		System.out.println(MemberShipType.SILVER.getSpecialPrice(BigDecimal.TEN));
		System.out.println(MemberShipType.GOLD.getSpecialPrice(BigDecimal.TEN));
		System.out.println(MemberShipType.PLATINUM.getSpecialPrice(BigDecimal.TEN));
		
		
	}

}
