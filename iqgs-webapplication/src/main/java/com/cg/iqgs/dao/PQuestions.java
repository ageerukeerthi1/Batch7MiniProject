package com.cg.iqgs.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.iqgs.model.PolicyQuestions;

public interface PQuestions {
		PolicyQuestions addPolicyQuestions(PolicyQuestions policyQuetions) throws SQLException;
//		
		List<PolicyQuestions> getAllPolicyQuestions() throws SQLException;
		
}
