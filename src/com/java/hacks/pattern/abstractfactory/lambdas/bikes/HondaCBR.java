package com.java.hacks.pattern.abstractfactory.lambdas.bikes;

import com.java.hacks.pattern.abstractfactory.lambdas.bikes.types.SportsBike;

public class HondaCBR extends SportsBike {

	@Override
	public void getModelName() {
		System.out.println("Honda CBR");
	}

}