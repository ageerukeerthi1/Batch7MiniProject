package com.cg.project.service;
import java.sql.SQLException;
import java.util.List;
import com.cg.project.model.Policies;


public interface IPoliciesService {
	public List<Policies> getAllPolicies()throws SQLException;
	public Policies addPolicies(Policies policies)throws SQLException;
	public Policies getPoliciesByPolicuNumber(Long PolicyNumber) throws SQLException;
	public Policies updatePolicies(Policies policy) throws SQLException;
	public boolean deletePolicies(Long PolicyNumber) throws SQLException;
	//Created interface
}
