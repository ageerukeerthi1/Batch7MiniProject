package com.cg.iqgs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.iqgs.exception.UserRolesNotFoundException;
import com.cg.iqgs.model.UserRoles;

public interface IUserRoleService {
	public List<UserRoles> getAllUserRoles()throws SQLException;
	public UserRoles addUserRoles(UserRoles userrole)throws SQLException;
	public UserRoles getUserRolesByUserName(String UserName) throws SQLException, UserRolesNotFoundException;
	public UserRoles updateUserRoles(UserRoles userrole) throws SQLException;
	public boolean deleteUserRoles(String user_Name) throws SQLException;
}