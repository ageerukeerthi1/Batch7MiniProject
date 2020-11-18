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

public class PolicyRepoImpl implements IPolicyRepo {
	Connection connection;
	PreparedStatement psmt;
	ResultSet rsPolicies;
	public PolicyRepoImpl() throws SQLException {
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
	@Override
	public Policies getPoliciesBypolicyNumber(String policyNumber) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
