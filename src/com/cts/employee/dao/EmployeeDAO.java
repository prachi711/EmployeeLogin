package com.cts.employee.dao;

import com.cts.employee.bean.EmployeeM;

public interface EmployeeDAO {
	
	public String insertEmployee(String empid, String firstname, String lastname, float salary);
	public String deleteEmployee( String empid);

}
