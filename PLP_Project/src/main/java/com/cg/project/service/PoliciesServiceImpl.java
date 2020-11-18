package com.cg.project.service;
import java.sql.SQLException;
import java.util.List;
import com.cg.project.dao.PolicyRepoImpl;
import com.cg.project.dao.IPolicyRepo;
import com.cg.project.model.Policies;

public class PoliciesServiceImpl implements IPoliciesService{
	IPolicyRepo repo;
	
	public  void PolicyServiceImpl() throws SQLException {
		repo=new PolicyRepoImpl();
	}
	
	public Policies addPolicies(Policies policies) throws SQLException {
		
		return repo.addPolicies(policies);
	}
	public List<Policies> getAllPolicies() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllPolicies();
	}

	@Override
	public Policies getPoliciesByPolicuNumber(Long PolicyNumber) throws SQLException {
		// TODO Auto-generated method stub
		return repo.getPoliciesBypolicyNumber(PolicyNumber);
	}

	@Override
	public Policies updatePolicies(Policies policy) throws SQLException {
		// TODO Auto-generated method stub
		
		return repo.updatePolicies(policy);
	}

	@Override
	public boolean deletePolicies(Long PolicyNumber) throws SQLException {
		// TODO Auto-generated method stub
		return repo.deletePolicies(PolicyNumber);
	}

	
}
