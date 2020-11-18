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
import com.cg.project.exception.UserRolesNotFoundException;

public class UserRoleRepoImpl implements IUserRoleRepo {
	Connection connection;
	PreparedStatement psmt;
	ResultSet rsUserRoles;
	public UserRoleRepoImpl() throws SQLException {
		connection=DBConnection.createConnection();
		
	}	
	public UserRoles addUserRole(UserRoles userrole) throws SQLException {		
		psmt=connection.prepareStatement("insert into Policy values(?,?,?)");
		psmt.setString(1, userrole.getUserName());
		psmt.setString(2, userrole.getPassword());
		psmt.setString(3, userrole.getRoleCode());
		psmt.executeUpdate();
		return userrole;
	}	
     public List<UserRoles> getAllUserRoles() throws SQLException {		
	psmt=connection.prepareStatement("select * from UserRoles");		
	 rsUserRoles=psmt.executeQuery();		
		List<UserRoles> userroles=new ArrayList<>();
		while(rsUserRoles.next()) {
		UserRoles userrole=new UserRoles();
		userrole.setUserName(rsUserRoles.getString("username"));
		userrole.setPassword(rsUserRoles.getString("password"));
		userrole.setRoleCode(rsUserRoles.getString("rolecode"));
		
		userroles.add(userrole);
	}
		return userroles;
	}

	public UserRoles getUserRolesByusername(String username) throws SQLException {
		// TODO Auto-generated method stub
		psmt=connection.prepareStatement("select * from  name where UserName=?");
		psmt.setString(1, username);
		rsUserRoles=psmt.executeQuery();
		if(!rsUserRoles.next()) {
			throw new UserRolesNotFoundException("Policies with NUMBER ["+username+"] does not exist");
		}
		UserRoles userrole=new UserRoles();
	    userrole.setUserName(rsUserRoles.getString("username"));
		userrole.setPassword(rsUserRoles.getString("password"));
		userrole.setRoleCode(rsUserRoles.getString("rolecode"));
		return userrole;
		
	}
	@Override
	public UserRoles updateUserRoles(UserRoles userrole) throws SQLException {
		// TODO Auto-generated method stub
		psmt=connection.prepareStatement("update Policies set PolicyNumber=?,AccountNumber=?,getPolicyPremium=?" );
		psmt.setString(1, userrole.getUserName());
		psmt.setString(2, userrole.getPassword());
		psmt.setString(3, userrole.getRoleCode());	
		int count=psmt.executeUpdate();
		return userrole;
	}
	@Override
	public boolean deleteUserRoles(String username) throws SQLException {
		// TODO Auto-generated method stub
		UserRoles olduserrole=getUserRolesByusername(username);
		psmt=connection.prepareStatement("delete from UserRoles where UserName=?");
		psmt.setString(1, username);
		int deleted=psmt.executeUpdate();
		return false;
	}
	@Override
	public UserRoles addUserRoles(UserRoles userrole) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
