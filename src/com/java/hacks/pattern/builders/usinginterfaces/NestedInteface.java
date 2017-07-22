package com.java.hacks.pattern.builders.usinginterfaces;

import com.java.hacks.pattern.builders.common.Person;

@FunctionalInterface
public interface NestedInteface {
	interface IFirstName {
		interface ILastName {
			interface IEmail {
				interface IAge {
					Person age(int age);
				}
				IAge email(String email);
			}
			IEmail lastName(String lastName);
		}
		ILastName firstName(String firstName);
	}
	
	IFirstName build();
}
