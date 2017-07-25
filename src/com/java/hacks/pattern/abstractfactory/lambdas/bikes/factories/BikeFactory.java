package com.java.hacks.pattern.abstractfactory.lambdas.bikes.factories;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.java.hacks.pattern.abstractfactory.lambdas.bikes.types.NormalBike;
import com.java.hacks.pattern.abstractfactory.lambdas.bikes.types.SportsBike;

public abstract class BikeFactory {
	
	public abstract NormalBike createNormalBike();

	public abstract SportsBike createSportsBike();

	public static BikeFactory getBikeFactory(BikeFactoryType type) {
		Map<BikeFactoryType, Supplier<BikeFactory>> map = new HashMap<>();
		map.put(BikeFactoryType.HONDA, HondaFactory::new);
		map.put(BikeFactoryType.YAMAHA, YamahaFactory::new);
		return map.get(type).get();
	}
}
