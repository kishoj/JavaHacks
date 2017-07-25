package com.java.hacks.pattern.abstractfactory.lambdas.bikes;

import com.java.hacks.pattern.abstractfactory.lambdas.bikes.types.SportsBike;

public class R15 extends SportsBike {

	@Override
	public void getModelName() {
		System.out.println("Yamaha R15");
	}

}