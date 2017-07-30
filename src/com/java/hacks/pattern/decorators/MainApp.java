package com.java.hacks.pattern.decorators;

public class MainApp {

	public static void main(String[] args) {
		Shape circle = new TimeShapeDecorator(new Circle());
		Shape rectangle = new TimeShapeDecorator(new Rectangle());
		
		circle.draw();
		rectangle.draw();
	}

}
