package com.cg.iqgs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PolicyQuestionsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger=LogManager.getLogger(PolicyQuestionsController.class);
	
	public PolicyQuestionsController() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("PolicyQuestion Created");
    }

}

