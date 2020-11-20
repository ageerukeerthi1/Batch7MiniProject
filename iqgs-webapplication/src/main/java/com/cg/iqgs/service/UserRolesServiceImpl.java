package com.cg.iqgs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.iqgs.dao.IUserRoleRepository;
import com.cg.iqgs.dao.UserRoleRepoImpl;
import com.cg.iqgs.exception.UserRolesNotFoundException;
import com.cg.iqgs.model.UserRoles;

public class UserRolesServiceImpl implements IUserRoleService{
	IUserRoleRepository repo;
	
	public UserRolesServiceImpl() throws SQLException {
		repo=new UserRoleRepoImpl();
	}
	
	public UserRoles addUserRole(UserRoles userrole) throws SQLException {
		
		return repo.addUserRoles(userrole);
	}
	public List<UserRoles> getAllUserRole() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllUserRoles();
		
		
	}

	@Override
	public UserRoles getUserRolesByUserName(String UserName) throws SQLException, UserRolesNotFoundException {
		// TODO Auto-generated method stub
		return repo.getUserRolesByusername(UserName);
	}

	@Override
	public UserRoles updateUserRoles(UserRoles userrole) throws SQLException {
		// TODO Auto-generated method stub
		return repo.updateUserRoles(userrole);
	}
	public boolean deleteUserRoles(String UserName) throws SQLException {
		// TODO Auto-generated method stub
		return repo.deleteUserRoles(UserName);
	}

	@Override
	public List<UserRoles> getAllUserRoles() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRoles addUserRoles(UserRoles userrole) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
