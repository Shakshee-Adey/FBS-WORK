package com.ash.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {
	
	private static String cname;
	private static String url;
	private static String user;
	private static String pass;
	
	public static  void databaseConfig()
	{
		try 
		{
			FileInputStream fis = new FileInputStream(".//Resources//databaseInfo.properties");
			Properties prop = new Properties();
			prop.load(fis);
			
			
			cname = prop.getProperty("classname");
			url   = prop.getProperty("url");
			user  = prop.getProperty("username");
			pass  = prop.getProperty("password");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static  Connection getSQLConnection()
	{
		databaseConfig();
		try
		{
			Class.forName(cname);
			Connection con = DriverManager.getConnection(url,user,pass);
			
			return con;
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public static void resourcesRelease(ResultSet rs, PreparedStatement psmt, Connection con) {
		// TODO Auto-generated method stub
		try 
		{
			rs.close();
			psmt.close();
			con.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	public static void resourcesRelease(PreparedStatement psmt, Connection con) {
		// TODO Auto-generated method stub
		try {
			psmt.close();
			con.close();
		} 
		catch (SQLException e)
		{
		 e.printStackTrace();
		}
	}

}
