package com.cg.iqgs.dao;

import java.sql.SQLException;

import java.util.List;

import com.cg.iqgs.exception.PolicyQuestionsNotFoundException;
import com.cg.iqgs.model.PolicyQuestions;

public interface IPolicyQuestionsRepository {
		
		public PolicyQuestions updatePolicyQuestions(PolicyQuestions policyQuetions) throws SQLException;
		public PolicyQuestions getPolicyQuestionsById(String polQuesId) throws SQLException, PolicyQuestionsNotFoundException;
		public boolean deletePolicyQuestions(String polQuesId) throws SQLException;
		public  PolicyQuestions createPolicyQuestions(PolicyQuestions policyQuetions) throws SQLException;
	
		
		
}