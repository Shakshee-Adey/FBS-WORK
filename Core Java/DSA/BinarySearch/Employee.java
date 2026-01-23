package BinarySearch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Employee {

	int id;
	String name;
	double salary;
	
	
	public Employee() {
		id=100;
		name="not given";
		salary=0;
	}
     
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary;
	}
}
class Testemp
{
	public static void main(String []args)
	{
		List<Employee>employee = new ArrayList<>();
		employee.add(new Employee(101,"Shakshee",50000));
		employee.add(new Employee(103,"Prachi",24000));
		employee.add(new Employee(106,"Vani",5000));
		employee.add(new Employee(104,"Rasu",51000));
		employee.add(new Employee(105,"Shakshi",30000));
		
		//collections.sort(employee,Comparator.comparingInt(Employee::getId));          //sort krne ke liye
		employee.sort(Comparator.comparingInt(Employee::getId));
		int x = 105;

        int result = binarySearch(employee, x);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
	}

	static int binarySearch(List<Employee> employee, int x) {
		
		int start=0;
		int end=employee.size()-1;
		
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			Employee midEmployee = employee.get(mid);
			
			if(midEmployee.getId()==x)
			{
				return mid;
			}
			else if(midEmployee.getId()>x)
			{
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}return -1;
	}
}
