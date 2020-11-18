package com.cg.IQGS.repository;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Policy_Questions {
	public static void main(String args[]) throws SQLException {
		Connection con;
		try {
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",
					"SYSTEM","SAIRAM");
			
			if(con!=null) {
				System.out.println("Connection Successful");
			}
			DriverManager.registerDriver(new com.cg.jdbc.Driver());      
		    java.sql.Statement smt=con.createStatement();
	      
	         String query = "CREATE TABLE Policy_Questions("
	          + "Pol_Ques_Id VARCHAR(10), "
	          + "Pol_Ques_Seq INT(3) NOT NULL, "
	          + "Pol_Ques_DESC VARCHAR(80), "
	          + "Pol_Ques_Ans1 VARCHAR(30), "
	          + "Pol_Ques_Ans1_Weightage INT(5) , "
 	          + "Pol_Ques_Ans2 VARCHAR(30), "
 	          + "Pol_Ques_Ans2_Weightage INT(5) , "
	          + "Pol_Ques_Ans3 VARCHAR(30), "
	          + "Pol_Ques_Ans3_Weightage INT(5) , "
	          + "Pol_Ques_Ans4 VARCHAR(30), "
	          + "Pol_Ques_Ans4_Weightage INT(5) , " 
	          + "PRIMARY KEY (Pol_Ques_Id))";
	         smt.execute(query);
	         System.out.println("Table Created......");
		}      
	   catch(SQLException e) {
		   e.printStackTrace();
	   }
	}
}