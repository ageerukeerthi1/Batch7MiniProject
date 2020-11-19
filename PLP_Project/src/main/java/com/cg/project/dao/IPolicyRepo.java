package com.cg.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.project.exception.PoliciesNotFoundException;
import com.cg.project.model.Policies;
import java.util.List;

import com.cg.project.model.Policies;

public interface IPolicyRepo {

	Policies addPolicies(Policies policy) throws SQLException;
	List<Policies> getAllPolicies() throws SQLException;
	Policies getPoliciesBypolicyNumber(Long policyNumber) throws SQLException;
	Policies updatePolicies(Policies policy) throws SQLException;
	boolean deletePolicies(Long policyNumber) throws SQLException;
	
	
	
	
}