package com.cg.iqgs.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.iqgs.service.IPolicyQuestionService;
import com.cg.iqgs.service.PolicyQuestionsSerImp;

public class PolicyQuestionsApp {
	static Connection connection;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		IPolicyQuestionService service = new PolicyQuestionsSerImp();
		
		PreparedStatement psmt = null;
		try {
			psmt = connection.prepareStatement("delete from PolicyQuestions where Pol_Ques_Seq=?");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Enter the Pol_Ques_Seq : ");
		int Pol_Ques_Seq=sc.nextInt();
		try {
			psmt.setInt(1,Pol_Ques_Seq);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int totalRowsDeleted = 0;
		try {
			totalRowsDeleted = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(totalRowsDeleted>0) {
			System.out.println("Deleted "+totalRowsDeleted +" records ");
		}
		else {
			System.out.println("No Data Found for ID : "+Pol_Ques_Seq);
		}
	}

}
