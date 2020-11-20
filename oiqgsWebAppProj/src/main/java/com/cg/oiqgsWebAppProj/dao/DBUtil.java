package com.cg.oiqgsWebAppProj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
static Connection conn;
public static Connection getConnection() throws SQLException {
	//conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","Anuja");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",
			"system","Anuja");
	return conn;

}
}
