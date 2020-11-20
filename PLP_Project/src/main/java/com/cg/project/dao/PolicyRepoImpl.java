package com.cg.project.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.cg.project.model.Policies;
import com.cg.project.model.UserRoles;
import com.cg.project.dao.DBConnection;
import com.cg.project.exception.PoliciesNotFoundException;

public class PolicyRepoImpl implements IPolicyRepo {
	Connection connection;
	PreparedStatement psmt;
	ResultSet rsPolicies;
	public void PolicyRepoImpl() throws SQLException {
		connection=DBConnection.createConnection();
		
	}		
     public List<Policies> getAllPolicies() throws SQLException {		
	psmt=connection.prepareStatement("select * from Policies");		
	 rsPolicies=psmt.executeQuery();		
		List<Policies> policies=new ArrayList<>();
		while(rsPolicies.next()) {
		Policies policy=new Policies();
		policy.setPolicyNumber(rsPolicies.getLong("policynumber"));
		policy.setAccountNumber(rsPolicies.getFloat("accountnumber"));
		policy.setPolicyPremium(rsPolicies.getLong("policypremuim"));
		
		policies.add(policy);
	}
		return policies;
	}
	public Policies addPolicies(Policies policies) throws SQLException {
		psmt=connection.prepareStatement("insert into Policy values(?,?,?)");
		psmt.setLong(1, policies.getPolicyNumber());
		psmt.setFloat(2, policies.getAccountNumber());
		psmt.setLong(3, policies.getPolicyPremium());
		psmt.executeUpdate();
		return policies;
	}
	public Policies getPoliciesBypolicyNumber(Long policyNumber) throws SQLException {
		psmt=connection.prepareStatement("select * from policy where PolicyNumber=?");
		psmt.setLong(1, policyNumber);
		rsPolicies=psmt.executeQuery();
		if(!rsPolicies.next()) {
			throw new PoliciesNotFoundException("Policies with NUMBER ["+policyNumber+"] does not exist");
		}
		Policies policy=new Policies();
	    policy.setPolicyNumber(rsPolicies.getLong("PolicyNumber"));
		policy.setAccountNumber(rsPolicies.getFloat("accountnumber"));
		policy.setPolicyPremium(rsPolicies.getInt("policypremium"));
		return policy;
	}
	@Override
	public Policies updatePolicies(Policies policy) throws SQLException {
		psmt=connection.prepareStatement("update Policies set PolicyNumber=?,AccountNumber=?,getPolicyPremium=?" );
		psmt.setLong(1, policy.getPolicyNumber());
		psmt.setFloat(2, policy.getAccountNumber());
		psmt.setLong(3, policy.getPolicyPremium());	
		int count=psmt.executeUpdate();
		return policy;
	}
	public boolean deletePolicies(long policyNumber) throws SQLException {
		Policies oldpolicy=getPoliciesBypolicyNumber(policyNumber);
		psmt=connection.prepareStatement("delete from Policies where PolicyNumber=?");
		psmt.setLong(1, policyNumber);
		int deleted=psmt.executeUpdate();
		return false;
	}
	
	public Policies getPoliciesBypolicyNumber(String policyNumber) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean deletePolicies(String policyNumber) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deletePolicies(Long policyNumber) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
}
	

