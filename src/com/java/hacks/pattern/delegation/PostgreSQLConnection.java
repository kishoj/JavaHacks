package com.java.hacks.pattern.delegation;

public class PostgreSQLConnection implements DatabaseConnection {

	private boolean isConnected = false;

	@Override
	public void connect() {
		System.out.println("Connecting to PostgreSQL...");
		isConnected = true;
	}

	@Override
	public void status() {
		if (isConnected) {
			System.out.println("PostgreSQL Status: Up");
		} else {
			System.out.println("PostgreSQL Status: Down");
		}
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected to PostgreSQL...");		
		isConnected = false;
	}

	@Override
	public boolean isConnected() {
		return isConnected;
	}

}
