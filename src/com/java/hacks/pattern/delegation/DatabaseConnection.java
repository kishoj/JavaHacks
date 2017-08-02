package com.java.hacks.pattern.delegation;

public interface DatabaseConnection {
	boolean isConnected();
	void status();
	void connect();
	void disconnect();
}
