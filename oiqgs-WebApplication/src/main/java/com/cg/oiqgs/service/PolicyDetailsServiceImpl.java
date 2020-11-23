package com.cg.oiqgs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.oiqgs.dao.IPolicyDetailsRepo;
import com.cg.oiqgs.dao.PolicyDetailsRepoImpl;
import com.cg.oiqgs.model.PolicyDetails;


public class PolicyDetailsServiceImpl implements IPolicyDetailsService{
	IPolicyDetailsRepo repo;
	
	public  PolicyDetailsServiceImpl() throws SQLException {
		repo=new PolicyDetailsRepoImpl();
	}

	public PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException {
		
		return repo.addPolicyDetails(policyDetails);
	}


	public List<PolicyDetails> getAllPolicyDetails() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllPolicyDetails();	
	}

	public PolicyDetails getPolicyDetailsByquestionId(String QuestionId) throws SQLException {
		// TODO Auto-generated method stub
		return repo.getPolicyDetailsByquestionId(QuestionId);
	}



	public boolean deletePolicyDetails(String questionId) throws SQLException {
		// TODO Auto-generated method stub
		return repo.deletePolicyDetails(questionId);
	}

	@Override
	public PolicyDetails getPolicyDetailsBypolicyNumber(long policyNumber) throws SQLException {
		// TODO Auto-generated method stub
		return repo.getPolicyDetailsBypolicyNumber(policyNumber);
	}
}
