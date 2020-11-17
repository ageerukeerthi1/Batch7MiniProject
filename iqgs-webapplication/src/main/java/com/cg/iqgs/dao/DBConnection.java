package com.cg.iqgs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
static Connection connection;
	
	public static Connection createConnection() throws SQLException {
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","SYSTEM","SAIRAM");
		return connection;
	}
}
