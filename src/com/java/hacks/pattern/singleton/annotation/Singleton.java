package com.java.hacks.pattern.singleton.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@EnableSingleton
public class Singleton {
	static Singleton instance = null;

	public static Singleton getInstance() {
		if (instance == null) {
			Class<Singleton> clazz = Singleton.class;
			Constructor<Singleton> cons = null;
			try {
				cons = clazz.getDeclaredConstructor();
				cons.setAccessible(true);
				instance = cons.newInstance();
			} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		} 
		return instance;
	}

}
