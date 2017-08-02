package com.java.hacks.pattern.delegation;

public class MainApp {

	public static void main(String[] args) {
		DatabaseConnection mysqlConn = new MySQLConnection();
		DatabaseConnection postgresqlConn = new PostgreSQLConnection();
		
		// Initially, databases are not connected
		PersistenceConnectionChecker checker = new PersistenceConnectionChecker(mysqlConn, postgresqlConn);
		checker.checkAllStatus();
		
		// Connected to databases
		PersistenceConnection connection = new PersistenceConnection(mysqlConn);
		connection.connect();	
		checker.checkStatus(mysqlConn);
		checker.checkStatus(postgresqlConn);
		connection.setDatabaseConnection(postgresqlConn);
		connection.connect();		
		
		// Check status of databases
		checker.checkAllStatus();		
		checker.disconnectAll();
		
		checker.checkAllStatus();
	}

}
