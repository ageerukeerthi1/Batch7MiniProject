package com.cg.iqgs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.iqgs.model.PolicyDetails;

public interface IPolicyDetailsService {
	
	public List<PolicyDetails> getAllPolicyDetails()throws SQLException;
	public PolicyDetails addPolicyDetails(PolicyDetails policyDetails)throws SQLException;
	public PolicyDetails getPolicyDetailsByquestionId(String questionId) throws SQLException;
	public boolean deletePolicyDetails(String questionId) throws SQLException;
	public PolicyDetails getPolicyDetailsBypolicyNumber(long policyNumber)throws SQLException;

}
