package com.java.hacks.pattern.container;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MainApp {

	public static void main(String[] args) {
		BeanContainer<String> container = new BeanContainer<>();
		container.add("Testing BeanContainer");
		container.add("Kishoj");
		container.add("Bajracharya");
		
		Iterator<String> iterator = container.iterator();		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		container.removeAll();
		
		container.add("Test Again");
		container.add("Hello World");
		
		streamOf(container.iterator()).forEach(System.out::println);
	}

	private static Stream<String> streamOf(Iterator<String> iterator) {
		return StreamSupport
					.stream(
						((Iterable<String>) () -> iterator)
							.spliterator(), false);
	}

}
