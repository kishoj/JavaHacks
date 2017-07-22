package com.java.hacks.pattern.annotation.exception;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MethodCaller {
	
	public static void call(Caller instance) throws Exception {
		Method m = instance.getClass().getMethod("call");
		Annotation as[] = m.getAnnotations();
		Catch[] li = null;
		for (Annotation a : as) {
			if (a.annotationType().equals(CatchGroup.class)) {
				li = ((CatchGroup) a).catchers();
			}
		}
		try {
			instance.call();
		} catch (Throwable e) {
			Class<?> ec = e.getClass();
			if (li == null) {
				return;
			}
			for (Catch cx : li) {
				if (cx.targetException().equals(ec)) {
					ExceptionListener h = cx.targetCatchHandler().newInstance();
					h.onException(e);
					break;
				}
			}
		}
	}
}
