package Model;

import Model.employee;

public class Admin extends employee
{
	double allowance;

	public Admin() {
		super();
		allowance =0;
	}

	public Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

    public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public double  calSalary()
	{
		return this.getSalary() * this.allowance;
	}

	@Override
	public String toString() {
		return super.toString() + "Admin [Allowance=" + allowance + "]";
	}
}
