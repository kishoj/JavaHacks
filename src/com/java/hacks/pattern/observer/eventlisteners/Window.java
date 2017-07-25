package com.java.hacks.pattern.observer.eventlisteners;

import java.util.ArrayList;
import java.util.List;

public class Window {
	
	class OpenAction implements EventListener {

		@Override
		public void fireEvent(Event event) {
			
		}
	}	
	
	class CloseAction implements EventListener {

		@Override
		public void fireEvent(Event event) {
			
		}
	}	
	
	class SaveAction implements EventListener {

		@Override
		public void fireEvent(Event event) {
			
		}
	}
	
	private List<? extends EventListener> listeners = new ArrayList<>();
	
	public Window() {}
	
	/*public void addListener(EventListener listner) {
		listeners.add(listner);
	}*/
}
