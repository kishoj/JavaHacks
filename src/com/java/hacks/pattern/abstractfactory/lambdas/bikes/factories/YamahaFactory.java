package com.java.hacks.pattern.abstractfactory.lambdas.bikes.factories;

import java.util.function.Supplier;

import com.java.hacks.pattern.abstractfactory.lambdas.bikes.Fz;
import com.java.hacks.pattern.abstractfactory.lambdas.bikes.R15;
import com.java.hacks.pattern.abstractfactory.lambdas.bikes.types.NormalBike;
import com.java.hacks.pattern.abstractfactory.lambdas.bikes.types.SportsBike;

public class YamahaFactory extends BikeFactory {

	@Override
	public NormalBike createNormalBike() {
		return ((Supplier<NormalBike>) Fz::new)
											.get();
	}

	@Override
	public SportsBike createSportsBike() {
		return ((Supplier<SportsBike>) R15::new)
											.get();
	}

}
