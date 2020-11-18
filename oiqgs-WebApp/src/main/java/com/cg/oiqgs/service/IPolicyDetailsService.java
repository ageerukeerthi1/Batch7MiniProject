package com.cg.oiqgs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.oiqgs.model.PolicyDetails;

public interface IPolicyDetailsService {
	public List<PolicyDetails> getAllPolicyDetails()throws SQLException;
	public PolicyDetails addPolicyDetails(PolicyDetails policyDetails)throws SQLException;
	

}
