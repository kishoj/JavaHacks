package com.java.hacks.pattern.functions.composition.timer;

import java.time.LocalDateTime;

public class Utils {
	
	public static LocalDateTime getStartTime(Void test) {
		System.out.println("Utils::getStartTime");
		return LocalDateTime.now();
	}
	
	public static LocalDateTime fxn(LocalDateTime startTime) {
		System.out.println("Utils::fxn");
		return startTime;
	}
	
	public static String getEndTime(LocalDateTime startTime) {
		LocalDateTime endTime = LocalDateTime.now();
		System.out.println("Utils::getEndTime");
		System.out.println("Start Time: " + startTime.toString());
		System.out.println("End Time: " + endTime.toString());
		String result = "Time Difference: ";
		return result;		
	}
}
