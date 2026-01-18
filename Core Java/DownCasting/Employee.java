package downcasting;

abstract public class Employee {
	 int id;
	 String name;
	 double salary;
	
	 //default
	 Employee()
	 {
		System.out.println("default constructor");
		  id=0;
		  name="Not given";
		  salary=1000;
      }
	 
	 //parameterized
	 Employee(int id, String name, double salary)
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
	 
	 void work()
	 {
		 System.out.println("Employee is working");
	 }

	 @Override
	 public String toString() {
		return "employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	 }
}
class Hr extends Employee
{
	double commission;

	
	Hr() {
		super();
		// TODO Auto-generated constructor stub
		commission=5000;
	}

	Hr(int id, String name, double salary,double commission) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	
	 double calSalary()
	 {
		 return salary+commission;
	 }
	 public static void giveBonus()
	 {
	        System.out.println("Hr bonus: 18%");
	    }
	

	 @Override
	 public String toString() {
		return super.toString() + "Hr [commission=" + commission + "]";
	 }
}
class Admin extends Employee
{
	double allowance;

	Admin() {
		super();
		allowance = 500;
	}

	Admin(int id, String name, double salary,double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

    double  getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	double  calSalary()
	{
		return salary * allowance;
	}
     
	public static void giveBonus() {
        System.out.println("Admin bonus: 8%");
    }
	@Override
	public String toString() {
		return super.toString() + "Admin [Allowance=" + allowance + "]";
	}
}
class SalesManager extends Employee
{
	double incentives;
	int target;
	
	SalesManager()
	{
		super();
		incentives = 500;
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
    
	public static void giveBonus() {
        System.out.println("sm bonus: 9%");
    }
	@Override
	public String toString() {
		return super.toString() + "SalesManager [incentives=" + incentives + ", target=" + target + "]";
	}
	
}
class TestEmployee
{
	public static void main(String args[])
	{
		Employee e1 = new Hr();          // Upcasting
        Employee e2 = new SalesManager();
        Employee e3 = new Admin();
		if (e1 instanceof Hr) {
		    Hr hr = (Hr) e1;
		    hr.giveBonus();
		}

		if (e2 instanceof SalesManager) {
		    SalesManager sm = (SalesManager) e2;
		    sm.giveBonus();
		}

		if (e3 instanceof Admin) {
		    Admin ad = (Admin) e3;
		    ad.giveBonus();
		}

	}

	
}
