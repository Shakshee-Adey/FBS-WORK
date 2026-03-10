package com.aspect;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionProvider {
	//connection provide krre hmne 
	public  static Connection provideConnection()
	{
		Connection con=null;
		try
		{
			FileInputStream fis=new FileInputStream(".//Resources//dbconfig.properties");
			Properties p = new Properties();
			p.load(fis);
			String classname=p.getProperty("classname");
			String url=p.getProperty("url");
			String user=p.getProperty("username");
			String pass=p.getProperty("password");
			
			Class.forName(classname);
			con=DriverManager.getConnection(url, user, pass);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
