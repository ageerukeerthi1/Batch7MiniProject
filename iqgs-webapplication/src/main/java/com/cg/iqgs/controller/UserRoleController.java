package com.cg.iqgs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.iqgs.service.IUserRoleService;
import com.cg.iqgs.service.UserRolesServiceImpl;


@WebServlet("/UserRole")
public class UserRoleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserRoleController() {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Username=request.getParameter("Username");
		String Password=request.getParameter("Password");
		String userType=request.getParameter("userType");
		HttpSession ssn=request.getSession();
		ssn.setAttribute("UserName", Username);
		request.setAttribute("userType",userType);
		request.getRequestDispatcher("usercreation.jsp").forward(request,response);		
    }

}