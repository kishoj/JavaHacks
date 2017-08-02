package com.java.hacks.pattern.delegation;

public class MySQLConnection implements DatabaseConnection {
	
	private boolean isConnected = false;

	@Override
	public void connect() {
		System.out.println("Connecting to MySQL...");
		isConnected = true;
	}

	@Override
	public void status() {
		if (isConnected) {
			System.out.println("MySQL Status: Up");
		} else {
			System.out.println("MySQL Status: Down");
		}
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected to MySQL...");		
		isConnected = false;
	}

	@Override
	public boolean isConnected() {
		return isConnected;
	}

}
