package newFun;

public class Emp {
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
	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Emp() {
		id=0;
		name ="not given";
		salary = 500;
		
	}
	@Override
	public String toString() {
		return "id= " + id + ", name=" + name + ", salary= " + salary;
	}
}
