package com.cg.iqgs.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.iqgs.model.BusinessSegment;
import com.cg.iqgs.model.PolicyDetails;

public interface IPolicyDetailsRepo {
	PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException;
	List<PolicyDetails> getAllPolicyDetails() throws SQLException;
	PolicyDetails getPolicyDetailsByquestionId(String questionId) throws SQLException;
	boolean deletePolicyDetails(String questionId) throws SQLException;
	PolicyDetails getPolicyDetailsBypolicyNumber(long policyNumber) throws SQLException;
}
