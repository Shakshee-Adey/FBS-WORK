package com.DAOIMPL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DAO.DAOInterface;
import com.aspect.ConnectionProvider;
import com.bean.User;

//implementation of all CRUD operation 

public class Daoimpl implements DAOInterface{

	//get the connection from Provider class
	
	Connection con=ConnectionProvider.provideConnection();
	PreparedStatement pst;
	ResultSet rs;
	
	@Override
	public void insertUser(User u)
	{
		try
		{
			pst=con.prepareStatement("insert into userTable values(?,?)");
			pst.setString(1,u.getUserName());
			pst.setString(2,u.getPassword());
			pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	@Override
	public boolean retriveData(String username) 
	{
		boolean flag=false;
		try
		{
			pst=con.prepareStatement("select *  from userTable where username=?");
			pst.setString(1, username);
			rs=pst.executeQuery();
			
			if(rs.next())  //ye tbb aage jayega jbb record aage hoga tbhi 
			{
				flag=true;   //or record h to true aayegs
			}
			else
			{
				flag=false;   //agr ye false h to record nhi h table me
			}
			return flag;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
      return flag;
	}
	
	
	

}
