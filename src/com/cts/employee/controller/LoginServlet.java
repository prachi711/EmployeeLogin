package com.cts.employee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.employee.service.LoginService;
import com.cts.employee.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String password;
	private String userName;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher requestDispatcher=null;
		LoginService loginService=LoginServiceImpl.getInstance();
		
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		if(loginService.authenticate(userid, password)){
			
			requestDispatcher = request.getRequestDispatcher("admin.html");
			requestDispatcher.forward(request,response);
			
			
			//System.out.println(userid);
			//System.out.println(password);
			
			
		}
		else {
			//redirect to login page
			
			requestDispatcher = request.getRequestDispatcher("login.html");
			requestDispatcher.forward(request,response);
			//requestDispatcher.include(request, response);
			 
		}
		
		/*String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		System.out.println(userid);
		System.out.println(password);
		RequestDispatcher requestDispatcher=null;
		
		if("admin".equals(userid) && userid.equals("admin"))
		{
			//response.sendRedirect("admin.html");
			requestDispatcher = request.getRequestDispatcher("admin.html");
			requestDispatcher.forward(request,response);
			requestDispatcher.include(request, response);
		}*/
		

	
	}

}
