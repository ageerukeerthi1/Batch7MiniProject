package com.cg.iqgs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cg.iqgs.exception.QuestionIdNotFoundException;
import com.cg.iqgs.model.PolicyDetails;

public class PolicyDetailsRepoImpl implements IPolicyDetailsRepo {
	PreparedStatement psmt;
	ResultSet policyResultSet;
	Connection connection;
	
	public PolicyDetailsRepoImpl() {
		try {
			connection=DBUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public PolicyDetails addPolicyDetails(PolicyDetails policyDetails ) throws SQLException {
		
		psmt=connection.prepareStatement("insert into Policy_Details values(?,?,?)");
		psmt.setLong(1, policyDetails.getPolicyNumber());
		psmt.setString(2, policyDetails.getQuestionId());
		psmt.setString(3, policyDetails.getAnswer());
				
		int count=psmt.executeUpdate();
		return policyDetails;
	}
public List<PolicyDetails> getAllPolicyDetails() throws SQLException {
	
	psmt=connection.prepareStatement("select * from Policy_Details");
		
		policyResultSet=psmt.executeQuery();
		
		List<PolicyDetails> details=new ArrayList<PolicyDetails>();
		while(policyResultSet.next()) {
			PolicyDetails policyDetails=new PolicyDetails();
			policyDetails.setPolicyNumber(policyResultSet.getLong("policyNumber"));
			policyDetails.setQuestionId(policyResultSet.getString("questionId"));
			policyDetails.setAnswer(policyResultSet.getString("answer"));
		    details.add(policyDetails);
	}
		return details;
	}

public PolicyDetails getPolicyDetailsByquestionId(String questionId) throws SQLException {
	psmt=connection.prepareStatement("select * from Policy_Details where QuestionId=?");
	psmt.setString(2, questionId);
	policyResultSet=psmt.executeQuery();
	if(!policyResultSet.next()) {
		throw new QuestionIdNotFoundException("Policy_Details with questionId ["+questionId+"] does not exist");
	}
	PolicyDetails policyDetails=new PolicyDetails();
	policyDetails.setPolicyNumber(policyResultSet.getLong("PolicyNumber"));
	policyDetails.setQuestionId(policyResultSet.getString("QuestionId"));
	policyDetails.setAnswer(policyResultSet.getString("Answer"));
	return policyDetails;
}
public boolean deletePolicyDetails(String questionId) throws SQLException {
	PolicyDetails oldpolicyDetail=getPolicyDetailsByquestionId(questionId);
	psmt=connection.prepareStatement("delete from Policy_Details where QuestionId=?");
	psmt.setString(1, questionId);
	int deleted=psmt.executeUpdate();
	return deleted>0;
}
@Override
public PolicyDetails getPolicyDetailsBypolicyNumber(long policyNumber) throws SQLException {
	// TODO Auto-generated method stub
	psmt=connection.prepareStatement("select * from Policy_Details where PolicyNumber=?");
	psmt.setLong(1, policyNumber);
	policyResultSet=psmt.executeQuery();
	if(!policyResultSet.next()) {
		throw new QuestionIdNotFoundException("Policy_Details with PolicyNumber ["+policyNumber+"] does not exist");
	}
	PolicyDetails policyDetails=new PolicyDetails();
	policyDetails.setPolicyNumber(policyResultSet.getLong("PolicyNumber"));
	policyDetails.setQuestionId(policyResultSet.getString("QuestionId"));
	policyDetails.setAnswer(policyResultSet.getString("Answer"));
	return policyDetails;
}
}

