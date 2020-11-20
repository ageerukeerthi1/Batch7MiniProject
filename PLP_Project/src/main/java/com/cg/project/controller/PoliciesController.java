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

import com.cg.project.model.Policies;
import com.cg.project.service.IPoliciesService;
import com.cg.project.service.PoliciesServiceImpl;

/**
 * Servlet implementation class AccountCreationController
 */
@WebServlet({"/add-policy","/view-policy"})
public class PoliciesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IPoliciesService service;
	@Override
	public void init() throws ServletException {
		
		service=new PoliciesServiceImpl();
	}
	//static Logger logger=LogManager.getLogger(PoliciesController.class); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PoliciesController() {
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
		if(uri.contains("/view-policy")) {
			try {
				viewPolicy(request, response);
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
		if(uri.contains("/add-policy")) {
			addAccount(request, response);
		}
	//	logger.info("Policies Created");
		//doGet(request, response);
	}
public void addAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		long policyNumber=Long.parseLong(request.getParameter("tpolicyNumber"));
	    float policyPremium=Float.parseFloat(request.getParameter("tpolicyPremium"));
		long accountNumber=Long.parseLong(request.getParameter("taccountNumber"));
		//String businessSegment=request.getParameter("tbusinessSegment");
		Policies policy=new Policies(policyNumber,policyPremium,accountNumber);
		
		
		
		try {
			service.addPolicies(policy);
		} catch (SQLException e) {
			response.sendError(400);
		}
		HttpSession ssn=request.getSession();
		ssn.setAttribute("policies", policy);
		response.sendRedirect("view-account.jsp");		
	}
	
	protected void viewPolicy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
			long policyNumber=Long.parseLong(request.getParameter("tpolicyNumber"));
			Policies policy=service.getPoliciesByPolicuNumber(policyNumber);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("policy", policy);
			response.sendRedirect("view-account.jsp");	
	}
	
}