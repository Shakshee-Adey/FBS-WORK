package com.DAO;

import com.bean.User;

//hold CRUD operations here

public interface DAOInterface
{
	public void insertUser(User u);
	public boolean retriveData(String username);
}
