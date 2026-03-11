package com.client;

import java.util.Scanner;

import com.aspect.ObjectCreater;
import com.servicesimp.LoginValidationServicesImpl;
import com.services.LoginValidationServices;

public class ClientCode {

	public static void main(String[] args) {
		
		//taking data  from the client enduser
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter username");
		String name=sc.nextLine();
		String password=sc.nextLine();
		
		LoginValidationServices login= ObjectCreater.createObject();
		login.createUser(name, password);
		
		boolean value=login.validateUser(name, password);
		if(value)
		{
			System.out.println("Welcome user.....");
		}
		else
		{
			System.out.println("please try again");
		}
		

	}

}
