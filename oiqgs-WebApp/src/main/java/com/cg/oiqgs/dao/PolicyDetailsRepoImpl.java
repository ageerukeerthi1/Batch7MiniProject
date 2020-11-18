package com.cg.oiqgs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cg.oiqgs.model.PolicyDetails;

public class PolicyDetailsRepoImpl implements IPolicyDetailsRepo {
	PreparedStatement psmt;
	ResultSet policyResultSet;
	Connection connection;

	public PolicyDetailsRepoImpl() throws SQLException {
		connection=DBUtil.createConnection();
	}
public PolicyDetails addPolicyDetails(PolicyDetails policyDetails ) throws SQLException {
		
		psmt=connection.prepareStatement("insert into Business_Segment values(?,?,?)");
		psmt.setLong(1, policyDetails.getPolicyNumber());
		psmt.setString(2, policyDetails.getQuestionId());
		psmt.setString(3, policyDetails.getAnswer());
				
		int count=psmt.executeUpdate();
		return policyDetails;
	}
public List<PolicyDetails> getAllPolicyDetails() throws SQLException {
	
	psmt=connection.prepareStatement("select * from PolicyDetails");
		
		policyResultSet=psmt.executeQuery();
		
		List<PolicyDetails> s=new ArrayList<PolicyDetails>();
		while(policyResultSet.next()) {
			PolicyDetails policyDetails=new PolicyDetails();
			policyDetails.setQuestionId(policyResultSet.getString("questionId"));
			policyDetails.setAnswer(policyResultSet.getString("answer"));
			policyDetails.setPolicyNumber(policyResultSet.getLong("policyNumber"));
		s.add(policyDetails);
	}
		return s;
	}
	
	
	


}
