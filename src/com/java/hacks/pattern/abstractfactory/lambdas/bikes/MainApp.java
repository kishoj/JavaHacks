package com.java.hacks.pattern.abstractfactory.lambdas.bikes;

import com.java.hacks.pattern.abstractfactory.lambdas.bikes.factories.BikeFactory;
import com.java.hacks.pattern.abstractfactory.lambdas.bikes.factories.BikeFactoryType;

public class MainApp { 
	
	public static void main(String[] args) {
		BikeFactory.getBikeFactory(BikeFactoryType.HONDA)
						.createNormalBike()
						.getModelName();

		BikeFactory.getBikeFactory(BikeFactoryType.HONDA)
						.createSportsBike()
						.getModelName();
		
		BikeFactory.getBikeFactory(BikeFactoryType.YAMAHA)
						.createNormalBike()
						.getModelName();

		BikeFactory.getBikeFactory(BikeFactoryType.YAMAHA)
						.createSportsBike()
						.getModelName();
	}

}
