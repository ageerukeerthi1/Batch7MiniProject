package com.cg.project.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.project.model.UserRoles;


public interface IUserRoleService {
	public List<UserRoles> getAllUserRoles()throws SQLException;
	public UserRoles addUserRoles(UserRoles userrole)throws SQLException;
	//Created interface
}
