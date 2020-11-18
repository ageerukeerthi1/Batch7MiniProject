package com.cg.iqgs.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.iqgs.exception.UserRolesNotFoundException;
import com.cg.iqgs.model.UserRoles;

public interface IUserRoleRepo {
	UserRoles addUserRoles(UserRoles userrole) throws SQLException;
	List<UserRoles> getAllUserRoles() throws SQLException;
	UserRoles getUserRolesByusername(String username) throws SQLException, UserRolesNotFoundException;
	UserRoles updateUserRoles(UserRoles userrole) throws SQLException;
	boolean deleteUserRoles(String username) throws SQLException;
}
