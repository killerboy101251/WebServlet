package com.training.web.service;

import java.util.List;

import com.training.web.dao.LoginDao;
import com.training.web.dao.LoginDaoImpl;
import com.training.web.model.User;

public class ServiceClassImpl implements LoginService {

	
	boolean isvalid1=false;
	@Override
	public boolean isValid(String userName, String password) {
		LoginDao  dao= new LoginDaoImpl();
		List<User> userList = dao.getUsers();
		for(User user:userList)
		{
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
			{
				isvalid1= true;
			}
		}
		
		return isvalid1;
	}

}
