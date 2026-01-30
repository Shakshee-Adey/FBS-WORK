package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	
	int id;
	String name;
	double salary;
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
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		id=0;
		name ="not given";
		salary = 500;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
class TestEmployee{
	
	public static void main(String[] args)
	{
		
		Employee e1=new Employee(101,"Shakshee",23000);
		Employee e2=new Employee(102,"Shak",2000);
		Employee e3=new Employee(103,"Shakshu",53000);
		List l1 = new ArrayList();  //linkedlist
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		System.out.println(l1);
	}
}