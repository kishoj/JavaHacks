package com.java.hacks.pattern.builders.genericbuilder;

// Idea from: https://stackoverflow.com/questions/31754786/how-to-implement-the-builder-pattern-in-java-8

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class GenericBuilder<T> implements Builder<T> {
	
	private final Supplier<T> instantiator;

    private List<Consumer<T>> instanceModifiers = new ArrayList<>();

    public GenericBuilder(final Supplier<T> instantiator) {
        this.instantiator = instantiator;
    }

    public static <T> GenericBuilder<T> of(Supplier<T> instantiator) {
        return new GenericBuilder<T>(instantiator);
    }

    public <U> GenericBuilder<T> with(BiConsumer<T, U> consumer, U value) {
        instanceModifiers.add(instance -> consumer.accept(instance, value));
        return this;
    }

	@Override
	public T build() {
		T object = instantiator.get();
        instanceModifiers.forEach(modifier -> modifier.accept(object));
        instanceModifiers.clear();
        return object;
	}

}