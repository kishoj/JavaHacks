package com.java.hacks.pattern.builders.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PersonBuilder {
	
	String firstName() default "Kishoj";
	String lastName() default "Bajracharya";
	String email() default "kishoj@gmail.com";
	int age() default 31;

}
