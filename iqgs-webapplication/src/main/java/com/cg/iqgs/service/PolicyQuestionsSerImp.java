package com.cg.iqgs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.iqgs.dao.PQuestions;
import com.cg.iqgs.model.PolicyQuestions;

public class PolicyQuestionsSerImp implements PolicyQuestionService  {
	
	PQuestions repo= (PQuestions) new PolicyQuestionsSerImp();
	
	
	@Override
	public PolicyQuestions addPolicyQuestions(PolicyQuestions policyQuestions) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PolicyQuestions> getAllPolicyQuestions() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
