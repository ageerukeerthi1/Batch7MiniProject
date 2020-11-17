package com.cg.iqgs.dao;

import java.sql.Connection;

import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.iqgs.model.PolicyQuestions;

public class PolicyQuestionsCrud {
	PreparedStatement psmt;
	ResultSet pResultSet;
	Connection connection;

	public PolicyQuestionsCrud() throws SQLException {
		connection=DBConnection.createConnection();
	}
	
	public PolicyQuestions addPolicyQuestions(PolicyQuestions policyQuestions ) throws SQLException {
		
		psmt=connection.prepareStatement("insert into Policy_Questions values(?,?,?,?,?,?,?,?,?,?,?,?)");
		psmt.setString(1, policyQuestions.getPolQuesId());
		psmt.setInt(2, policyQuestions.getPolQuesSeq());
		psmt.setString(3, policyQuestions.getPolQuesDesc());
		psmt.setString(4, policyQuestions.getPolQuesAns1());
		psmt.setString(5, policyQuestions.getPolQuesAns2());
		psmt.setString(6, policyQuestions.getPolQuesAns3());
		psmt.setString(7, policyQuestions.getPolQuesAns4());
		psmt.setInt(8, policyQuestions.getPolQuesAns1Weightage());
		psmt.setInt(9, policyQuestions.getPolQuesAns2Weightage());
		psmt.setInt(10, policyQuestions.getPolQuesAns3Weightage());
		psmt.setInt(11, policyQuestions.getPolQuesAns4Weightage());
		
				
		int count=psmt.executeUpdate();
		return policyQuestions;
		
	}
	public List<PolicyQuestions> getAllPolicyQuestions() throws SQLException {
		
		psmt=connection.prepareStatement("select * from Policy_Questions");
			
			pResultSet=psmt.executeQuery();
			
			List<PolicyQuestions> p=new ArrayList<PolicyQuestions>();
			while(pResultSet.next()) {
				PolicyQuestions policyQuestions=new PolicyQuestions();
				policyQuestions.setPolQuesId(pResultSet.getString("polQuesId"));
				policyQuestions.setPolQuesSeq(pResultSet.getInt("polQuesSeq"));
				policyQuestions.setPolQuesDesc(pResultSet.getString("polQuesDesc"));
				policyQuestions.setPolQuesAns1(pResultSet.getString("polQuesAns1"));
				policyQuestions.setPolQuesAns2(pResultSet.getString("polQuesAns2"));
				policyQuestions.setPolQuesAns3(pResultSet.getString("polQuesAns3"));
				policyQuestions.setPolQuesAns4(pResultSet.getString("polQuesAns4"));
				policyQuestions.setPolQuesAns1Weightage(pResultSet.getInt("polQuesAns1Weightage"));
				policyQuestions.setPolQuesAns2Weightage(pResultSet.getInt("polQuesAns2Weightage"));
				policyQuestions.setPolQuesAns3Weightage(pResultSet.getInt("polQuesAns3Weightage"));
				policyQuestions.setPolQuesAns4Weightage(pResultSet.getInt("polQuesAns4Weightage"));
				
			p.add(policyQuestions);
		}
			return p;
		}
	
}

