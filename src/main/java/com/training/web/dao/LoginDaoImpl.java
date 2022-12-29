package com.training.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.web.model.User;

public class LoginDaoImpl implements LoginDao {

	@Override
	public List<User> getUsers() {
		 Connection conn = null;
		 String un="root";
        String pass="Mohanreddy123@";
        String s = "jdbc:mysql://localhost:3306/mohan";
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


        try {
			conn=DriverManager.getConnection(s,un,pass);
			 Statement stmt= conn.createStatement();
			ResultSet res= stmt.executeQuery("select * from user_pass");
			List<User> userList = new ArrayList<>();
			while(res.next())
			{
				userList.add(new User(res.getString(1),res.getString(2)));
			}
			return userList;
		} catch (SQLException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        finally
        {
        	try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
      
		return null;
	}
	

}
