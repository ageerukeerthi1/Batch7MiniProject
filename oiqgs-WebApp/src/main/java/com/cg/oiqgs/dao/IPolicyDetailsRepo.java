package com.cg.oiqgs.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.oiqgs.model.PolicyDetails;

public interface IPolicyDetailsRepo {
	PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException;
	List<PolicyDetails> getAllPolicyDetails() throws SQLException;

}
