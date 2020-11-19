package com.cg.project.dao;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {


	static Connection connection;
	
	public static Connection createConnection() throws SQLException {
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","password");
		return connection;
	}
	
}