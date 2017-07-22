package com.java.hacks.pattern.builders.usinglambdas;

import com.java.hacks.pattern.builders.setter.Person;

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
