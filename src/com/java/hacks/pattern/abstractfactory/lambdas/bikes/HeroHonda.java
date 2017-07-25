package com.java.hacks.pattern.abstractfactory.lambdas.bikes;

import com.java.hacks.pattern.abstractfactory.lambdas.bikes.types.NormalBike;

public class HeroHonda extends NormalBike {

	@Override
	public void getModelName() {
		System.out.println("Hero Honda");
	}

}