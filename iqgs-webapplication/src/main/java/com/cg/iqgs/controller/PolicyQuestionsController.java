package com.cg.iqgs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.iqgs.service.IPolicyQuestionService;
import com.cg.iqgs.service.PolicyQuestionsSerImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/add-account","/view-account"})
public class PolicyQuestionsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IPolicyQuestionService service;
	@Override
	public void init() throws ServletException {
		
		service=new PolicyQuestionsSerImp();
	}
	static Logger logger=LogManager.getLogger(PolicyQuestionsController.class); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PolicyQuestionsController() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
}