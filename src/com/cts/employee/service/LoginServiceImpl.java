package com.cts.employee.service;



import com.cts.employee.dao.LoginDAO;
import com.cts.employee.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
	
	private LoginServiceImpl()
	{
		
	}
	private static LoginServiceImpl loginServiceImpl;
	private LoginDAO dao=LoginDAOImpl.getInstance();
	public static LoginServiceImpl getInstance(){
		if(loginServiceImpl==null)
		{
			loginServiceImpl=new LoginServiceImpl();
			return loginServiceImpl;
		}
		else
		{
			return loginServiceImpl;
		}
	}

	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		
		
		return dao.getUserStatus(id);
	}

	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return dao.getUserType(id);
	}

	public boolean authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		
		
		return dao.authenticate(userName, password);
	}

}
