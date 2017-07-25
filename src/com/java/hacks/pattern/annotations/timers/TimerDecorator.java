package com.java.hacks.pattern.annotations.timers;

import java.time.LocalDateTime;

public class TimerDecorator implements LogTimer {
	
	LogTimer timer;
	
	public TimerDecorator(LogTimer timer) {
		this.timer = timer;
	}
	
	@Override
	public void logTime() {
		LocalDateTime startDateTime = LocalDateTime.now();
		System.out.println("Start DateTime: " + startDateTime.toString());
		
		timer.logTime();
		
		LocalDateTime endDateTime = LocalDateTime.now();
		System.out.println("End DateTime: " + endDateTime.toString());
	}
}
