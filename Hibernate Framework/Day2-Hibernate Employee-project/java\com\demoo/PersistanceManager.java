package com.demoo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersistanceManager {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory factory;
		
		try
		{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();
			
			//object to persist in the  database table
			
			Employee emp=new Employee(0,"Shaksee Adey",300000.0f, "Shakshee@gmail.com", 349000);
			
			// Create Project
	        Project p = new Project(101,"E-Commerce","React","Spring Boot");
	        
	        emp.setProject(p);

	        session.save(emp);  // cascade will handle project
			session.save(emp);
			
			tr.commit();
			
			System.out.println("Record addded");
			
			//Employee emp1=(Employee)session.load(Employee.class,new Integer(102));  it will give error
			
			//Employee emp1 = (Employee)session.get(Employee.class, 102);  //get the datA FROM the 
			//System.out.println(emp1);
			Employee emp1 = session.get(Employee.class, emp.geteId());
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
