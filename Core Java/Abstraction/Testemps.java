//package abstraction;

abstract class employees {
        
	 int id;
	 String name;
	 double salary;
	
	 //default
	 employees()
	 {
		System.out.println("default constructor");
		  id=100;
		  name="not given";
		  salary=1000;
      }
	 
	 //parameterized
	 employees(int id, String name, double salary)
	 {
		System.out.println("para constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	 }
	 
	 // setter and getters
	 
	 int getId() {
		 return id;
	 }
	 void setId(int id) {
		 this.id = id;
	 }
	 String getName() {
		 return name;
	 }
	 void setName(String name) {
		 this.name = name;
	 }
	 double getSalary() {
		 return salary;
	 }
	 void setSalary(double salary) {
		 this.salary = salary;
	 }
	 
	 abstract double calSalary();

	 @Override
	 public String toString() {
		return "employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	 }
}
class Hr extends employees
{
	int commission;

	
	Hr() {
		super();
		// TODO Auto-generated constructor stub
		commission=500;
	}

	Hr(int id, String name, double salary,int commission) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
		this.commission = commission;
	}

	int getCommission() {
		return commission;
	}

	void setCommission(int commission) {
		this.commission = commission;
	}
	
	 double calSalary()
	 {
		 return salary * commission;
	 }

	 @Override
	 public String toString() {
		return super.toString() + "Hr [commission=" + commission + "]";
	 }
}
class Admin extends employees
{
	int Allowance;

	Admin() {
		super();
		Allowance = 100;
	}

	Admin(int id, String name, double salary,int Allowance) {
		super(id, name, salary);
		this.Allowance = Allowance;
	}

    int  getAllowance() {
		return Allowance;
	}

	void setAllowance(int allowance) {
		Allowance = allowance;
	}
	
	double  calSalary()
	{
		return salary * Allowance;
	}

	@Override
	public String toString() {
		return super.toString() + "Admin [Allowance=" + Allowance + "]";
	}
}
class SalesManager extends employees
{
	double incentives;
	int target;
	
	SalesManager()
	{
		super();
		incentives =200;
		target = 10;
	}
	
	SalesManager(int id, String name, double salary, double incentives, int target) {
		super(id,name,salary);
		this.incentives = incentives;
		this.target = target;
	}

	double getIncentives() {
		return incentives;
	}

	void setIncentives(double incentives) {
		this.incentives = incentives;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}
	
	double calSalary()
	{
		return salary * incentives;
	}

	@Override
	public String toString() {
		return super.toString() + "SalesManager [incentives=" + incentives + ", target=" + target + "]";
	}
	
	
}

class Testemps
{
	public static void main(String[] args)
	{
		employees e1;
		
		e1 = new Hr();
		System.out.println(e1);
		System.out.println("Total Salary: " + e1.calSalary());
		System.out.println("\n");

               e1 = new Hr(101,"prachi",2400,400);
		System.out.println(e1);
		
		e1=new Admin();
	        System.out.println(e1);
		System.out.println("Total Salary: " + e1.calSalary());
		System.out.println("\n");
		
		e1=new SalesManager();
	        System.out.println(e1);
		System.out.println("Total Salary: " + e1.calSalary());
	}
}
