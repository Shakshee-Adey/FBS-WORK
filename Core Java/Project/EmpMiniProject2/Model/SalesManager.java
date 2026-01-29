package Model;

import Model.employee;

public class SalesManager extends employee
{
	double incentives;
	int target;
	
	public SalesManager()
	{
		super();
		incentives = 0;
		target = 0;
	}
	
	public SalesManager(int id, String name, double salary, double incentives, int target) {
		super(id,name,salary);
		this.incentives = incentives;
		this.target = target;
	}

	public double getIncentives() {
		return incentives;
	}

	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}
	
	public double calSalary()
	{
		return this.getSalary() + this.incentives;
	}

	@Override
	public String toString() {
		return super.toString() + "SalesManager [incentives=" + incentives + ", target=" + target + "]";
	}
	
	
}
