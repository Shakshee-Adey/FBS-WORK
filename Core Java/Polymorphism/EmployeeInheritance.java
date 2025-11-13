class Employee {
	int id;
	String name;
	double salary;
	static int count = 0;


	             // default constructor
	Employee() {
		System.out.println("Employee default constructor");
		id = 100;
		name = "Not Given";
		salary = 1000;
		count++;
	}              

	Employee(int id, String name, double salary) {
		System.out.println("Employee parameterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
		count++;
	}

	
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

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Employee.count = count;
	}

	void display() {
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
	}

}// class employee ends here

class HR extends Employee {
	double commission;


	 HR() {
		 super(); 
                 System.out.println("Hr default constructor");
	         commission = 2000;
	}

	 HR(int id, String name, double salary, double commission) {
			super(id, name,salary);
			this.commission = commission;
			System.out.println("HR parameterized constructor");
	}

	
	double getCommission() {
		return commission;
	}

	 void setCommission(double commission) {
		 this.commission = commission;
	 }

	// Display function
	 void display() {
			super.display();
			System.out.println("Commission: " + this.commission);
		}	
}//class Hr ends here

class SalesManager extends Employee {
	double incentives;
	int target;

	SalesManager() {
		super();
                System.out.println("SalesManager default constructor");
		incentives = 1000;
		target = 6;
		
	}

	SalesManager(int id, String name, double salary, double incentives, int target) {
		super(id, name, salary);
		this.incentives = incentives;
		this.target = target;
		System.out.println("SalesManager parameterized constructor");
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

	// Display function
	void display() {
		super.display();
		System.out.println("Incentives: " + this.incentives);
		System.out.println("Target: " + this.target);
	}
}//salesmaanger ends here

class Admin extends Employee {
	double allowance;

	Admin() {
		super();
                System.out.println("Admin default constructor");
		allowance = 2000;
		
	}

	Admin(int id, String name, double salary ,double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
		System.out.println("Admin parameterized constructor");
	}
	
	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	void display() {
		super.display();
		System.out.println("Allowance: " + this.allowance);
	}
}

class EmployeeInheritance {
	public static void main(String[] args) {

		Employee e1 = new Employee(11, "Shakshi", 2500);
		e1.display();
		System.out.println("\n");

		e1 = new HR(111, "Shakshee", 25000, 2000);
		e1.display();
		System.out.println("\n");

		e1 = new SalesManager(222, "Prachi", 5000, 4000, 5);
		e1.display();
		System.out.println("\n");
		
		e1 = new Admin(333, "Vani", 30000, 800);
		e1.display();
                System.out.println("\n");

		System.out.println("\nTotal Employees: " + Employee.getCount());
	}
}