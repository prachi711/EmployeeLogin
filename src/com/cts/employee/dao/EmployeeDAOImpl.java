package com.cts.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.cts.employee.bean.EmployeeM;
import com.cts.employee.util.DBUtils;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static EmployeeDAOImpl employeeDAOImpl;
	public static EmployeeDAOImpl getInstance(){
		if(employeeDAOImpl==null)
		{
			employeeDAOImpl=new EmployeeDAOImpl();
			return employeeDAOImpl;
		}
		else
		{
			return employeeDAOImpl;
		}
		
	}
	
	private EmployeeDAOImpl() {}

	public String insertEmployee(String empid, String firstname, String lastname, float salary) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement preparedstatement=null;
		connection=DBUtils.getConnection();
		
		
		return null;
	}

	public String deleteEmployee(String empid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	

	
	
}

	
	