package Controller;

import Model.Employee;

public class EmployeeController {
	EmployeeDAO ed=new EmployeeDAO();
	
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		if(ed.addEmployee(e)) {
			System.out.println("Successfull!!!");
		}else {
			System.out.println("Array is Full!!");
		}
		
	}

	public Employee searchEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee e1=ed.searchEmployee(id);
		if(e1!=null) {
			return e1;
		}
		return null;
	}

	public boolean updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		if(ed.updateEmployee(id,salary)) {
			return true;
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		if(ed.deleteEmployee(id)) {
			return true;
		}
		return false;
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		ed.displayAll();
		
	}

	public void sortEmployee(int type) {
		ed.sortEmployee(type);
	}

	
	

}