package com.cg.iqgs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.iqgs.exception.UserRolesNotFoundException;
import com.cg.iqgs.model.UserRoles;

public class UserRoleRepoImpl implements IUserRoleRepository {
		Connection connection;
		PreparedStatement psmt;
		ResultSet rsUserRoles;
		public UserRoleRepoImpl() throws SQLException {
			connection=DBUtil.getConnection();	
		}
		@Override
		public UserRoles addUserRoles(UserRoles userrole) throws SQLException {
			psmt=connection.prepareStatement("insert into Policy values(?,?,?)");
			psmt.setString(1, userrole.getUserName());
			psmt.setString(2, userrole.getPassword());
			psmt.setString(3, userrole.getRoleCode());
			psmt.executeUpdate();
			return userrole;
		}
		@Override
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
		@Override
		public UserRoles getUserRolesByusername(String username) throws SQLException, UserRolesNotFoundException {
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
			psmt=connection.prepareStatement("update Policies set PolicyNumber=?,AccountNumber=?,getPolicyPremium=?" );
			psmt.setString(1, userrole.getUserName());
			psmt.setString(2, userrole.getPassword());
			psmt.setString(3, userrole.getRoleCode());	
			int count=psmt.executeUpdate();
			return userrole;
		}
		@Override
		public boolean deleteUserRoles(String username) throws SQLException {
			try {
				UserRoles olduserrole=getUserRolesByusername(username);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UserRolesNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			psmt=connection.prepareStatement("delete from UserRoles where UserName=?");
			psmt.setString(1, username);
			int deleted=psmt.executeUpdate();
			return false;
		}	
}	