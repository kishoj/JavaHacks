package com.java.hacks.pattern.functions.composition.timer;

import java.time.LocalDateTime;
import java.util.function.Function;

public class MainApp {

	public static void main(String[] args) {
		Function<Void, LocalDateTime> noteStartTime = Utils::getStartTime;
		Function<LocalDateTime, LocalDateTime> functionToExecute = Utils::fxn;
		Function<LocalDateTime, String> noteEndTime = Utils::getEndTime;

		Function<Void, String> test = noteStartTime
							.andThen(functionToExecute)
							.andThen(noteEndTime);
		
		System.out.println(test.apply(null));
	}

}
