package com.cts.employee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class employeeRegistration
 */
public class employeeRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeeRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String empid=request.getParameter("empid");
		String FirstName=request.getParameter("FirstName");
		String LastName=request.getParameter("LastName");
		String salary=request.getParameter("salary");
		System.out.println(empid);
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(salary);
	}

}
