package com.java.hacks.pattern.abstractfactory.lambdas.bikes.factories;

import java.util.function.Supplier;

import com.java.hacks.pattern.abstractfactory.lambdas.bikes.HeroHonda;
import com.java.hacks.pattern.abstractfactory.lambdas.bikes.HondaCBR;
import com.java.hacks.pattern.abstractfactory.lambdas.bikes.types.NormalBike;
import com.java.hacks.pattern.abstractfactory.lambdas.bikes.types.SportsBike;

public class HondaFactory extends BikeFactory {

	@Override
	public NormalBike createNormalBike() {
		return ((Supplier<NormalBike>) HeroHonda::new)
												.get();
	}

	@Override
	public SportsBike createSportsBike() {
		return ((Supplier<SportsBike>) HondaCBR::new)
												.get();
	}

}
