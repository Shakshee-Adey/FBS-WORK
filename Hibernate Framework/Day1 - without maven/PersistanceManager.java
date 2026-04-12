package com;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.Employee;
public class PersistanceManager {

	public static void main(String[] args) 
	{
		Session session = null;
		SessionFactory factory;
		
		try
		{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();
			
			//object to persist in the  database table
			
			Employee emp=new Employee(101,"Shaksee Adey",300000.0f);
			session.save(emp);
			tr.commit();
			
			System.out.println("Record addded");
			
			//Employee emp1=(Employee)session.load(Employee.class,new Integer(102));  it will give error
			
			Employee emp1 = (Employee)session.get(Employee.class, 102);  //get the datA FROM the 
			System.out.println(emp1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		    if(session != null)
		    {
		    	//session.flush();
		        session.close();
		    }
		}
	}

}
