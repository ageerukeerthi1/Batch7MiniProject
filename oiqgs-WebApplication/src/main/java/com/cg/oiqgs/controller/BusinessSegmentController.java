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

import com.cg.oiqgs.model.BusinessSegment;
import com.cg.oiqgs.service.BusinessSegmentServiceImpl;
import com.cg.oiqgs.service.IBusinessSegmentService;

/**
 * Servlet implementation class StudentRegistrationController
 */
@WebServlet({"/add-busseg","/view-busseg","/view-all","/delete"})
public class BusinessSegmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IBusinessSegmentService service;
	
	@Override
	public void init() throws ServletException {
		
		
		try {
			service=new BusinessSegmentServiceImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri=request.getRequestURI();
		if(uri.contains("/add-busseg")) {
			addBusinessSegment(request, response);
		}
				
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		if(uri.contains("/view-busseg")) {
			try {
				viewBusinessSegment(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		else if(uri.contains("/delete")) {
			try {
				deleteBusinessSegment(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(uri.contains("/view-all")) {
			try {
				viewAllBusinessSegment(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void addBusinessSegment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bus_Seg_Id=request.getParameter("bus_Seg_Id");
		String bus_Seg_Name=request.getParameter("bus_Seg_Name");
		int bus_Seg_Seq=Integer.parseInt(request.getParameter("bus_Seg_Seq"));
		BusinessSegment businessSegment=new BusinessSegment(bus_Seg_Id,bus_Seg_Name,bus_Seg_Seq);
		
		try {
			service.addBusinessSegment(businessSegment);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		HttpSession ssn=request.getSession();
		ssn.setAttribute("businessSegment", businessSegment);
		response.sendRedirect("view-busseg.jsp");		
	}
	
	protected void viewAllBusinessSegment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		List<BusinessSegment> businessSegments=service.getAllBusinessSegment();
		HttpSession ssn=request.getSession();
		ssn.setAttribute("businessSegments", businessSegments);
		response.sendRedirect("view-all.jsp");	
}
	
	protected void viewBusinessSegment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
			String bus_Seg_Id=request.getParameter("bus_Seg_Id");
			BusinessSegment businessSegment=service.getBusinessSegmentBybusSegId(bus_Seg_Id);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("businessSegment", businessSegment);
			response.sendRedirect("view-busseg.jsp");	
	}
	
	protected void deleteBusinessSegment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		String busSegId=request.getParameter("bus_Seg_Id");
		service.deleteBusinessSegment(busSegId);
		System.out.println("busSeg with ID "+busSegId+" Deleted");
		response.sendRedirect("add-busseg.jsp");	
}
	
}