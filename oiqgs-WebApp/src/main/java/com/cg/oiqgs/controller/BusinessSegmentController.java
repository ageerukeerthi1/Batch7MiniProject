package com.cg.oiqgs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.oiqgs.model.BusinessSegment;
import com.cg.oiqgs.service.BusinessSegmentServiceImpl;
import com.cg.oiqgs.service.IBusinessSegmentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


/**
 * Servlet implementation class BusinessSegmentController
 */
@WebServlet({"/add-BusinessSegment","/view-businessSegment"})
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
	static Logger logger=LogManager.getLogger(BusinessSegmentController.class); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusinessSegmentController() {
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
		if(uri.contains("/view-businessSegment")) {
			try {
				viewBusinessSegment(request, response);
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
		if(uri.contains("/add-BusinessSegment")) {
			addBusinessSegment(request, response);
		}
		logger.info("BusinessSegment Created");
		//doGet(request, response);
	}
public void addBusinessSegment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	    String busSegId=request.getParameter("busSegId");
	    String busSegName=request.getParameter("busSegName");
		int busSegSeq=Integer.parseInt(request.getParameter("busSegSeq"));
		BusinessSegment businessSegment=new BusinessSegment(busSegId,busSegName,busSegSeq);
		
		try {
			service.addBusinessSegment(businessSegment);
		} catch (SQLException e) {
			response.sendError(400);
		}
		HttpSession ssn=request.getSession();
		ssn.setAttribute("businessSegment", businessSegment);
		response.sendRedirect("view-businessSegment.jsp");		
	}
	
	protected void viewBusinessSegment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
			String busSegId=(request.getParameter("busSegId"));
			BusinessSegment businessSegment=service.getBusinessSegmentBybusSeqId(busSegId);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("businessSegment", businessSegment);
			response.sendRedirect("view-businessSegment.jsp");	
	}
	
}