package com.cg.iqgs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.iqgs.exception.UserRolesNotFoundException;
import com.cg.iqgs.model.UserRoles;
import com.cg.iqgs.service.IUserRoleService;
import com.cg.iqgs.service.UserRolesServiceImpl;


@WebServlet("/UserRole")
public class UserRoleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IUserRoleService service;
	@Override
	public void init() throws ServletException {
		
		
		try {
			service=new UserRolesServiceImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri=request.getRequestURI();
		if(uri.contains("/add-busseg")) {
			addUserRoles(request, response);
		}		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		if(uri.contains("/view-busseg")) {
			try {
				try {
					viewUserRoles(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UserRolesNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (SQLException e) {
				response.sendError(500);
			}
			
		}
		else if(uri.contains("/delete")) {
			try {
				deleteUserRoles(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
public void addUserRoles(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String User_Name=request.getParameter("User_Name");
		String Password=request.getParameter("Password");
		String Role_Code=request.getParameter("Role_Code");
		UserRoles userrole=new UserRoles(User_Name,Password,Role_Code);
		
		try {
			service.addUserRoles(userrole);
		} catch (SQLException e) {
			response.sendError(400);
		}
		HttpSession ssn=request.getSession();
		ssn.setAttribute("userroles", userrole);
		response.sendRedirect("view-usercreation.jsp");		
	}
protected void viewUserRoles(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, UserRolesNotFoundException {
	String User_Name=request.getParameter("User_Name");
	UserRoles userrole=service.getUserRolesByUserName(User_Name);
	HttpSession ssn=request.getSession();
	ssn.setAttribute("userroles", userrole);
	response.sendRedirect("view-userrole.jsp");	
}
protected void deleteUserRoles(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	String UserName=request.getParameter("User_Name");
	service.deleteUserRoles(UserName);
	
	response.sendRedirect("add-userrole.jsp");	
}
}