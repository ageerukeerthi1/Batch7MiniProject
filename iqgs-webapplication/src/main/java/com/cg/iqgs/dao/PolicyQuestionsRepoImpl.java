package com.cg.iqgs.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.cg.iqgs.exception.PolicyQuestionsNotFoundException;

import com.cg.iqgs.model.PolicyQuestions;

public class PolicyQuestionsRepoImpl implements IPolicyQuestionsRepository {
	PreparedStatement psmt;
	ResultSet pResultSet;
	Connection connection;
	public PolicyQuestionsRepoImpl() {
		try {
			connection=DBUtil.getConnection();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public PolicyQuestions createPolicyQuestions(PolicyQuestions policyQuetions) throws SQLException {
		psmt=connection.prepareStatement("insert into Policy_Questions values(?,?,?,?,?,?,?,?,?,?,?,?)");
		psmt.setString(1, policyQuetions.getPolQuesId());
		psmt.setInt(2, policyQuetions.getPolQuesSeq());
		psmt.setString(3, policyQuetions.getPolQuesDesc());
		psmt.setString(4, policyQuetions.getPolQuesAns1());
		psmt.setString(5, policyQuetions.getPolQuesAns2());
		psmt.setString(6, policyQuetions.getPolQuesAns3());
		psmt.setString(7, policyQuetions.getPolQuesAns4());
		psmt.setInt(8, policyQuetions.getPolQuesAns1Weightage());
		psmt.setInt(9, policyQuetions.getPolQuesAns2Weightage());
		psmt.setInt(10, policyQuetions.getPolQuesAns3Weightage());
		psmt.setInt(11, policyQuetions.getPolQuesAns4Weightage());		
		int count=psmt.executeUpdate();
		return policyQuetions;
		
	}
	@Override
	public PolicyQuestions updatePolicyQuestions(PolicyQuestions policyQuetions) throws SQLException {
		psmt=connection.prepareStatement("update PolicyQuestions set PolQuesId=?,PolQuesSeq=?,PolQuesDesc=?,PolQuesAns1=?,PolQuesAns2=?,PolQuesAns3=?,PolQuesAns4=?,PolQuesAns1Weightage=?,PolQuesAns2Weightage=?,PolQuesAns3Weightage=?PolQuesAns4Weightage=? where PolQuesId=?" );
		psmt.setString(1, policyQuetions.getPolQuesId());
		psmt.setInt(2, policyQuetions.getPolQuesSeq());
		psmt.setString(3, policyQuetions.getPolQuesDesc());
		psmt.setString(4, policyQuetions.getPolQuesAns1());
		psmt.setString(5, policyQuetions.getPolQuesAns2());
		psmt.setString(6, policyQuetions.getPolQuesAns3());
		psmt.setString(7, policyQuetions.getPolQuesAns4());
		psmt.setInt(8, policyQuetions.getPolQuesAns1Weightage());
		psmt.setInt(9, policyQuetions.getPolQuesAns2Weightage());
		psmt.setInt(10, policyQuetions.getPolQuesAns3Weightage());
		psmt.setInt(11, policyQuetions.getPolQuesAns4Weightage());		
		int count=psmt.executeUpdate();
		return policyQuetions;
	}
	@Override
	public PolicyQuestions getPolicyQuestionsById(String polQuesId) throws SQLException, PolicyQuestionsNotFoundException 
	
		{
			psmt=connection.prepareStatement("select * from Policy_Questions where Pol_Ques_Id=?");
			psmt.setString(1, polQuesId);
			pResultSet=psmt.executeQuery();
			if(!pResultSet.next()) {
				throw new PolicyQuestionsNotFoundException("Policy Question with Id ["+polQuesId+"] does not exist");
			}
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
			
		    return policyQuestions;
		}
	

	@Override
	public boolean deletePolicyQuestions(String polQuesId) throws SQLException {
		try {
			PolicyQuestions oldpolicyquestion=getPolicyQuestionsById(polQuesId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PolicyQuestionsNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		psmt=connection.prepareStatement("delete from PolicyQuestions where polQuesId=?");
		psmt.setString(1, polQuesId);
		int deleted=psmt.executeUpdate();
		return deleted>0;
	}
	
	
}
