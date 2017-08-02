package com.java.hacks.pattern.delegation;

import java.util.Arrays;
import java.util.Optional;

public class PersistenceConnectionChecker {
	
	private DatabaseConnection[] connections;

	public PersistenceConnectionChecker(DatabaseConnection... connections) { 
		this.connections = connections;
	}
	
	public void checkAllStatus() {
		System.out.println("Checking connection to all persistences...");
		Arrays.stream(connections).forEach(connection -> {
			connection.status();
		});
	}

	public void disconnectAll() {
		Arrays.stream(connections).forEach(connection -> {
			connection.disconnect();
		});
	}

	public void checkStatus(DatabaseConnection connection) {
		Optional<DatabaseConnection> maybeConnection = Arrays.stream(connections).filter(conn -> conn.equals(connection) && connection.isConnected()).findAny();
		if (maybeConnection.isPresent()) {
			maybeConnection.get().status();
		} else {
			System.out.println("Given database is not connected yet.");
		}
	}

}
