package Model;

import Model.employee;

public class Hr extends employee
{
	double commission;

	
	public Hr() {
		super();
		// TODO Auto-generated constructor stub
		commission=0;
	}

	public Hr(int id, String name, double salary,double commission) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	 public double calSalary()
	 {
		 return this.getSalary()+this.commission;
	 }

	 @Override
	 public String toString() {
		return super.toString() + "Hr [commission=" + commission + "]";
	 }
}