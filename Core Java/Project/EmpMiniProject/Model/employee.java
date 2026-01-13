package Model;

public abstract class employee {
        
		 int id;
		 String name;
		 double salary;
		
		 //default
		 public employee()
		 {
			  id=0;
			  name="not given ";
			  salary=10000;
	      }
		 
		 //parameterized
		 public employee(int id, String name, double salary)
		 {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		 }
		 
		 // setter and getters
		 
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
		 
		 public abstract double calSalary();

		 @Override
		 public String toString() {
			return "employees [id=" + this.id + "\nname=" + this.name + "\nsalary=" + this.salary + "]";
		 }
	}
