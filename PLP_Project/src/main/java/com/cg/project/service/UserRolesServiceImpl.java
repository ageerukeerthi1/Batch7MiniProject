package com.cg.project.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.project.dao.UserRoleRepoImpl;
import com.cg.project.dao.IUserRoleRepo;
import com.cg.project.model.UserRoles;

public class UserRolesServiceImpl implements IUserRoleService{
	IUserRoleRepo repo;
	
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