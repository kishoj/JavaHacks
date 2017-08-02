package com.java.hacks.pattern.delegation;

public class PersistenceConnection {
	
	private DatabaseConnection databaseConnection;
	
	public PersistenceConnection(DatabaseConnection databaseConnection) { 
		this.databaseConnection = databaseConnection;
	}
	
	public void connect() {
		System.out.println("Connecting to Persistence...");
		databaseConnection.connect();
	}

	public DatabaseConnection getDatabaseConnection() {
		return databaseConnection;
	}

	public void setDatabaseConnection(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}	
}
