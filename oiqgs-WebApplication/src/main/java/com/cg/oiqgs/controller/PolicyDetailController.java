package com.cg.oiqgs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.cg.oiqgs.model.PolicyDetails;
import com.cg.oiqgs.service.IPolicyDetailsService;
import com.cg.oiqgs.service.PolicyDetailsServiceImpl;

/**
 * Servlet implementation class StudentRegistrationController
 */
@WebServlet({"/add-poldet","/view-poldet"})
public class PolicyDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IPolicyDetailsService service;
	
	@Override
	public void init() throws ServletException {
		
		
		try {
			service=new PolicyDetailsServiceImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri=request.getRequestURI();
		if(uri.contains("/add-poldet")) {
			addPolicyDetails(request, response);
		}			
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		if(uri.contains("/view-poldet")) {
			try {
				viewPolicyDetails(request, response);
			} catch (SQLException e) {
				response.sendError(500);
			}
			
		}	
	}
	
	public void addPolicyDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long policyNumber=Long.parseLong(request.getParameter("policyNumber"));
		String questionId=request.getParameter("questionId");
		String answer=request.getParameter("answer");
		PolicyDetails policyDetails=new PolicyDetails(policyNumber,questionId,answer);
		
		try {
			service.addPolicyDetails(policyDetails);
		} catch (SQLException e) {
			response.sendError(400);
		}
		HttpSession ssn=request.getSession();
		ssn.setAttribute("policyDetails", policyDetails);
		response.sendRedirect("view-poldet.jsp");		
	}
	
	protected void viewPolicyDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
			String questionId=request.getParameter("questionId");
			PolicyDetails policyDetails=service.getPolicyDetailsByquestionId(questionId);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("policyDetails", policyDetails);
			response.sendRedirect("view-poldet.jsp");	
	}
	
	
}