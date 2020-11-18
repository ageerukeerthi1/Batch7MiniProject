package com.cg.iqgs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
static Connection connection;
	
	public static Connection getConnection() throws SQLException {
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","SYSTEM","SAIRAM");
		return connection;

	}
}
