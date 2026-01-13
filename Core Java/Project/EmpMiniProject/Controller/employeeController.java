package Controller;

import Model.employee;

public class employeeController {
   employeeDAO ed = new employeeDAO();
   
	public void addEmployee(employee e) {
		// TODO Auto-generated method stub
		if (ed.addEmployee(e))
		{
			System.out.println("Successfull!!!");
		}
		else
		{
			System.out.println("Array is full!!!");
		}
	}

	public employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		employee e1 = ed.searchEmployee(id);
		if(e1!=null)
		{
			return e1;
		}
		return null;
	}

	public boolean updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		if(ed.UpdateEmployee(id,salary))
		{
			return true;
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		if(ed.DeleteEmployee(id))
		{
			return true;
		}
		return false;
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		ed.diplayAll();
		
	}


}
