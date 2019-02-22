package com.cts.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.employee.util.DBUtils;

public class LoginDAOImpl implements LoginDAO {
	
		private static LoginDAOImpl loginDAOImpl;
		public static LoginDAOImpl getInstance(){
			if(loginDAOImpl==null)
			{
				loginDAOImpl=new LoginDAOImpl();
				return loginDAOImpl;
			}
			else
			{
				return loginDAOImpl;
			}
				
			}

	
	private LoginDAOImpl() {}
	
	public int getUserStatus(String id)
	{
		String query=" select status from login where userid=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		connection =DBUtils.getConnection();
		
		try {
			 preparedStatement=connection.prepareStatement(query);
			 preparedStatement.setString(1,id);
			 resultSet = preparedStatement.executeQuery();
			 if(resultSet.next()){
				return resultSet.getInt("status") ;
			 }
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return -1;
	}
	public String getUserType(String type)
	{    
		String query=" select usertype from login where userid=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		connection =DBUtils.getConnection();
		
		try {
			 preparedStatement=connection.prepareStatement(query);
			 preparedStatement.setString(1,type);
			 resultSet = preparedStatement.executeQuery();
			 if(resultSet.next()){
				return resultSet.getString("usertype") ;
			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		String query="select * from login where userid=? and password=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		connection =DBUtils.getConnection();
		
		try {
			 preparedStatement=connection.prepareStatement(query);
			 preparedStatement.setString(1,userName);
			 preparedStatement.setString(2,password);
			 resultSet = preparedStatement.executeQuery();
			 if(resultSet.next()){
				return true ;
			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return false;
	}


	public String authorization(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
