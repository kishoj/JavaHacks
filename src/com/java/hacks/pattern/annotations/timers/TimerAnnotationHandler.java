package com.java.hacks.pattern.annotations.timers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class TimerAnnotationHandler {
	
	public static void processAnnotations(Object obj) {
		Class<?> clazz = obj.getClass();
		for (Method method : clazz.getDeclaredMethods()) {
			Timer timer = method.getAnnotation(Timer.class);
			if (timer != null) {
				if (timer.set()) {
					LocalDateTime startDateTime = LocalDateTime.now();
					System.out.println("Start DateTime: " + startDateTime.toString());
					invokeMethod(method, obj);
					LocalDateTime endDateTime = LocalDateTime.now();
					System.out.println("End DateTime: " + endDateTime.toString());
				} else {
					invokeMethod(method, obj);
				}
			}
		}
	}

	private static void invokeMethod(Method method, Object obj) {
		try {
			method.invoke(obj);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
