package com.java.hacks.pattern.annotations.callbacks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Caller {

	public Caller() {
	}

	public void register(Class<TestCallBack> clazz) {
		String packageName = clazz.getPackage().getName();
		System.out.println(packageName);

		for (Method method : clazz.getDeclaredMethods()) {
			if (Modifier.isPublic(method.getModifiers()) && method.isAnnotationPresent(Callback.class)) {
				try {
					method.invoke(clazz.newInstance());
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
