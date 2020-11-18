package com.cg.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.project.model.UserRoles;

public interface IUserRoleRepo {

	UserRoles addUserRoles(UserRoles userrole) throws SQLException;
	List<UserRoles> getAllUserRoles() throws SQLException;
	UserRoles getUserRolesByusername(String username) throws SQLException;
	
	
	
	
}