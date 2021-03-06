package com.cg.oiqgsWebAppProj.controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.cg.oiqgsWebAppProj.model.Accounts;
import com.cg.oiqgsWebAppProj.service.AccountService;
import com.cg.oiqgsWebAppProj.service.AccountServiceImpl;

/**
 * Servlet implementation class AccountCreationController
 */
@WebServlet({"/add-account","/view-account"})
public class AccountCreationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountService service;
	@Override
	public void init() throws ServletException {
		
		/*try {
			service=new AccountServiceImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	//static Logger logger=LogManager.getLogger(AccountCreationController.class); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountCreationController() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri=request.getRequestURI();
		if(uri.contains("/add-account")) {
			//addAccount(request, response);
			  long accountNumber=Long.parseLong(request.getParameter("taccountNumber"));
				String insuredName=request.getParameter("tinsuredName");
				String insuredStreet=request.getParameter("tinsuredStreet");
				String insuredCity=request.getParameter("tinsuredCity");
				String insuredState=request.getParameter("tinsuredState");
				long insuredZip=Long.parseLong(request.getParameter("tinsuredZip"));
				String businessSegment=request.getParameter("tbusinessSegment");
				String userName=request.getParameter("tuserName");
				Accounts account=new Accounts(accountNumber,insuredName,insuredStreet,insuredCity,insuredState,insuredZip,businessSegment,userName);						
				
				try {
					service=new AccountServiceImpl();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					service.addAccount(account);
				} catch (SQLException e) {
					response.sendError(400);
				}
				HttpSession ssn=request.getSession();
				ssn.setAttribute("accounts", account);
				response.sendRedirect("view-account.jsp");
	
		}
		//logger.info("Account Created");
		
	
		}
			
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uri=request.getRequestURI();
		if(uri.contains("/view-account")) {
			try {
				service=new AccountServiceImpl();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				//viewAccount(request, response);
				long accountNumber=Long.parseLong(request.getParameter("taccountNumber"));
				Accounts account=service.getAccountByNumber(accountNumber);
				HttpSession ssn=request.getSession();
				ssn.setAttribute("accounts", account);
				response.sendRedirect("view-account.jsp");
			} catch (SQLException e) {
				response.sendError(500);
			}
			
		}		
	}

	/*protected void viewAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
			long accountNumber=Long.parseLong(request.getParameter("taccountNumber"));
			Accounts account=service.getAccountByNumber(accountNumber);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("accounts", account);
			response.sendRedirect("view-account.jsp");	
	}*/	
}
