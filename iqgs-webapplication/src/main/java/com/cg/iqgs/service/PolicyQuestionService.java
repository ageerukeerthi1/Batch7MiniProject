package com.cg.iqgs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.iqgs.model.PolicyQuestions;

public interface PolicyQuestionService {
public PolicyQuestions addPolicyQuestions(PolicyQuestions policyQuestions)throws SQLException;	
	public List<PolicyQuestions> getAllPolicyQuestions()throws SQLException;
}
