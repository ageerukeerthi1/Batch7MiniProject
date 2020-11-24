package com.cg.iqgs.controller;

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

import com.cg.iqgs.model.BusinessSegment;
import com.cg.iqgs.model.PolicyDetails;
import com.cg.iqgs.service.IPolicyDetailsService;
import com.cg.iqgs.service.PolicyDetailsServiceImpl;

/**
 * Servlet implementation class StudentRegistrationController
 */
@WebServlet({"/addpoldet","/viewpoldet","/viewallpoldet"})
public class PolicyDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IPolicyDetailsService service;
	
	@Override
	public void init() throws ServletException {
		
		
		try {
			service=new PolicyDetailsServiceImpl();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri=request.getRequestURI();
		if(uri.contains("/addpoldet")) {
			addPolicyDetails(request, response);
		}			
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		if(uri.contains("/viewpoldet")) {
			try {
				viewPolicyDetails(request, response);
			} catch (SQLException e) {
				response.sendError(500);
			}
			
		}
		else if(uri.contains("/viewallpoldet")) {
			try {
				viewAllPolicyDetails(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void addPolicyDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		long policyNumber=Long.parseLong(request.getParameter("PolicyNumber"));
		String questionId=request.getParameter("QuestionId");
		String answer=request.getParameter("Answer");
		PolicyDetails policyDetails=new PolicyDetails(policyNumber,questionId,answer);
		
		try {
			service.addPolicyDetails(policyDetails);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		HttpSession ssn=request.getSession();
		ssn.setAttribute("policyDetails", policyDetails);
		response.sendRedirect("view-poldet.jsp");		
	}
	
protected void viewAllPolicyDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		List<PolicyDetails> policyDetails=service.getAllPolicyDetails();
		HttpSession ssn=request.getSession();
		ssn.setAttribute("policyDetails", policyDetails);
		response.sendRedirect("viewall-poldet.jsp");	
}
	protected void viewPolicyDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		long policyNumber=Long.parseLong(request.getParameter("PolicyNumber"));
			PolicyDetails policyDetails=service.getPolicyDetailsBypolicyNumber(policyNumber);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("policyDetails", policyDetails);
			response.sendRedirect("view-poldet.jsp");	
	}
	
	
}