package com.ash.demos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class EmployeeManagement {
	
	int empId;
	String empName;
	double empSal;
	Scanner sc=new Scanner(System.in);
	
	public void addEmp()
	{
		System.out.println("Enter empId : ");
		empId=sc.nextInt();
		System.out.println("Enter empName : ");
		empName=sc.next();
		System.out.println("Enter empSalary : ");
		empSal=sc.nextDouble();
		
		try {
			Connection con = DBUtility.getSQLConnection();
			String insertQuery = "insert into employee values(?,?,?)";
			PreparedStatement psmt= con.prepareStatement(insertQuery);
			psmt.setInt(1, empId);
			psmt.setString(2,empName);
			psmt.setDouble(3, empSal);
			
			int rows = psmt.executeUpdate();
			if(rows>0)
				System.out.println("data inserted");
			
			DBUtility.resourcesRelease(psmt,con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void searchEmp()
	{
		System.out.println("Enter empId to search : ");
	    int id = sc.nextInt();

	    try
	    {
	        Connection con = DBUtility.getSQLConnection();
	        String query = "SELECT * FROM employee WHERE id = ?";
	        PreparedStatement psmt = con.prepareStatement(query);
	        psmt.setInt(1, id);

	        ResultSet rs = psmt.executeQuery();

	        if(rs.next())
	        {
	            
	               int empId= rs.getInt(1);
	                String empName= rs.getString(2);
	               double empSal= rs.getDouble(3);
	    
	            System.out.println("employee found" + empId+"/"+empName+"/"+empSal);
	        }
	        else
	        {
	            System.out.println("Employee not found");
	        }

	        DBUtility.resourcesRelease(rs, psmt, con);
	    }
	    catch(SQLException e)
	    {
	        e.printStackTrace();
	    }
		
		
	}
	public void updateEmp()
	{
		 System.out.println("Enter empId to update salary : ");
		    int id = sc.nextInt();
		    System.out.println("Enter new salary : ");
		    double salary = sc.nextDouble();

		    try
		    {
		        Connection con = DBUtility.getSQLConnection();
		        String query = "UPDATE employee SET salary = ? WHERE id = ?";
		        PreparedStatement psmt = con.prepareStatement(query);
		        psmt.setDouble(1, salary);
		        psmt.setInt(2, id);

		        int rows = psmt.executeUpdate();

		        if(rows > 0)
		            System.out.println("Employee salary updated successfully");
		        else
		            System.out.println("Employee not found");

		        DBUtility.resourcesRelease(psmt, con);
		    }
		    catch(SQLException e)
		    {
		        e.printStackTrace();
		    }
		
	}
	public void deleteEmp()
	{
		 System.out.println("Enter empId to delete : ");
		    int id = sc.nextInt();

		    try
		    {
		        Connection con = DBUtility.getSQLConnection();
		        String query = "DELETE FROM employee WHERE id = ?";
		        PreparedStatement psmt = con.prepareStatement(query);
		        psmt.setInt(1, id);

		        int rows = psmt.executeUpdate();

		        if(rows > 0)
		            System.out.println("Employee deleted successfully");
		        else
		            System.out.println("Employee not found");

		        DBUtility.resourcesRelease(psmt, con);
		    }
		    catch(SQLException e)
		    {
		        e.printStackTrace();
		    }
		
	}
	public void displayAll()
	{
		
			try {
				Connection con = DBUtility.getSQLConnection();
				String query = "SELECT * FROM EMPLOYEE";
				PreparedStatement psmt = con.prepareStatement(query);
				ResultSet rs = psmt.executeQuery();
				while(rs.next())
				{
				  empId = rs.getInt(1);
				  empName = rs.getString(2);
				  empSal = rs.getDouble(3);
				  
				  Employee ref = new Employee(empId,empName,empSal);
				  System.out.println(ref);
				}
				DBUtility.resourcesRelease(rs,psmt,con);
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
	}

}
