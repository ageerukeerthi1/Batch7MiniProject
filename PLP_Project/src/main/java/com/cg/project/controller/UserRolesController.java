package com.cg.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.cg.project.model.UserRoles;
import com.cg.project.service.IUserRoleService;
import com.cg.project.service.UserRolesServiceImpl;

/**
 * Servlet implementation class AccountCreationController
 */
@WebServlet({"/add-userroles","/view-userroles"})
public class UserRolesController extends HttpServlet {
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
	//static Logger logger=LogManager.getLogger(PoliciesController.class); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRolesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uri=request.getRequestURI();
		if(uri.contains("/view-userrole")) {
			try {
				viewUserRole(request, response);
			} catch (SQLException e) {
				response.sendError(500);
			}
			
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri=request.getRequestURI();
		if(uri.contains("/add-userrole")) {
			addAccount(request, response);
		}
		//logger.info("UserRoles Created");
		//doGet(request, response);
	}
public void addAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String userName=request.getParameter("tuserName");
		String password=request.getParameter("tpassword");
		String roleCode=request.getParameter("troleCode");
		//String businessSegment=request.getParameter("tbusinessSegment");
		UserRoles userrole=new UserRoles(userName,password,roleCode);
		
		
		
		try {
			service.addUserRoles(userrole);
		} catch (SQLException e) {
			response.sendError(400);
		}
		HttpSession ssn=request.getSession();
		ssn.setAttribute("userrole", userrole);
		response.sendRedirect("view-userrole.jsp");		
	}
	
	protected void viewUserRole(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		    String userName=request.getParameter("tuserName");
			UserRoles userrole=service.getUserRolesByUserName(userName);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("userrole", userrole);
			response.sendRedirect("view-account.jsp");	
	}
	
}