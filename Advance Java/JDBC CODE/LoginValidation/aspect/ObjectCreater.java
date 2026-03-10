package com.aspect;

import java.io.FileInputStream;
import java.util.Properties;

import com.services.LoginValidationServices;
import com.servicesimp.LoginValidationServicesImpl;

public class ObjectCreater {

	public static LoginValidationServices createObject() {
		
		String classname=null;
		LoginValidationServices login=null;
		try
		{
			FileInputStream fis=new FileInputStream(".//Resources//info.properties");
			Properties p = new Properties();
			p.load(fis);
			classname=p.getProperty("businessClass");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			login=(LoginValidationServices)Class.forName(classname).newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return login;
	}

}
