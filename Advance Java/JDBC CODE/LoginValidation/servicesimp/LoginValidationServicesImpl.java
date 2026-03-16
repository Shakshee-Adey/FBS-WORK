package com.servicesimp;
import com.DAOIMPL.Daoimpl;
import com.bean.User;
import com.services.LoginValidationServices;

//Business logic class
	public class LoginValidationServicesImpl implements LoginValidationServices
	{
		//data supplied by POJO   with a has a relationship
		User u;
		
		
		//integrated with DAO class foe CRUD operations 
		Daoimpl dao= new Daoimpl();
		
		@Override
		public void createUser(String userName, String password)
		{
			u = new User(userName, password);   // local object
		    dao.insertUser(u);                  // store object into DB
       }
		@Override
		public boolean validateUser(String userName, String password)
		{
			
			boolean flag=false;
			
			//verify the users data with persisted data using DAO class
			flag=dao.retriveData(userName);
			
			
			//if(u.getUserName().equals(userName)) if(u.getPassword().equalsIgnoreCase(password)){flag=true;}
			//else{flag=false;}
		 	return flag;
		}
		
}
