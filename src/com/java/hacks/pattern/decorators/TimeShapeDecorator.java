package com.java.hacks.pattern.decorators;

import java.time.LocalDateTime;

public class TimeShapeDecorator extends ShapeDecorator {

	public TimeShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		getStartTime();
		decoratedShape.draw();
		getEndTime();
		System.out.println("Time Difference: ");
	}

	private LocalDateTime getStartTime() {
		System.out.println("Getting Start Time");
		return LocalDateTime.now();
	}

	private LocalDateTime getEndTime() {
		System.out.println("Getting End Time");
		return LocalDateTime.now();
	}

}
