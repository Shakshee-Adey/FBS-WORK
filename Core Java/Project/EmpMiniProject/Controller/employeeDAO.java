package Controller;

import Model.Admin;
import Model.Hr;
import Model.SalesManager;
import Model.employee;

public class employeeDAO {
      
	static employee[] eArr;   //=new employee[5];
	static int count;  //count=0;
	static  
	{
		eArr=new employee[12];
		count=0;
		eArr[count++] = new Hr(101,"Shakshee",50000,5000);
		eArr[count++] = new Hr(102,"Prachi",48000,4500);
		eArr[count++] = new Hr(103,"Vani",47000,4000);
		eArr[count++] = new SalesManager(201,"Bharti",60000,13,7);
		eArr[count++] = new SalesManager(202,"Shivani",50500,11,5);
		eArr[count++] = new SalesManager(203,"varsha",55000,10,8);
		eArr[count++] = new Admin(301,"Prit",40000,5000);
		eArr[count++] = new Admin(302,"Shivam",5000,5800);
		eArr[count++] = new Admin(303,"Piyush",50000,5900);
		eArr[count++] = new Admin(304,"Roop",70000,500);
	}
	public boolean addEmployee(employee e) {
		// TODO Auto-generated method stub
		if(count<eArr.length)
		{
			eArr[count++]=e;
			return true ;
		}
		return false;
		
	}
	public employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		for(int i=0; i<count; i++)
		{
			if(eArr[i].getId() == id) {
				return eArr[i];
			}
		}return null;
	}
	public boolean UpdateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		for(int i=0; i<count; i++)
		{
			if(eArr[i].getId() == id) {
				eArr[i].setSalary(salary);
				return true;
			}
		}
		return false;
	}
	public boolean DeleteEmployee(int id) {
		// TODO Auto-generated method stub
		for(int i=0; i<count; i++)
		{
			if(eArr[i].getId() == id) {
				for(int j=i; j<count; j++)
				{
					eArr[j]= eArr[j+1];
				}
				eArr[--count] = null;
				return true;
			}
		}
		return false;
	}
	public void diplayAll() {
		// TODO Auto-generated method stub
		for(int i=0; i<count; i++)
		{
			System.out.println(eArr[i]);
		}
	}
}
