package com.java.hacks.pattern.annotations.exception;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Catch {
	public Class<? extends ExceptionListener> targetCatchHandler();
	public Class<? extends Throwable> targetException() default Exception.class;
}
