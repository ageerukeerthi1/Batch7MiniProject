package com.cg.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.project.model.Policies;

public interface IPolicyRepo {

	Policies addPolicies(Policies policy) throws SQLException;
	List<Policies> getAllPolicies() throws SQLException;
	Policies getPoliciesBypolicyNumber(String policyNumber) throws SQLException;
	
	
	
	
}