package com;

import java.util.Objects;

public class Employee {
	
	private int eId;
	private String eName;
	private float eSal;
	
	public Employee() {
		
	}

	public Employee(int eId, String eName, float eSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public float geteSal() {
		return eSal;
	}

	public void seteSal(float eSal) {
		this.eSal = eSal;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(eId, eName, eSal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eId == other.eId && Objects.equals(eName, other.eName)
				&& Float.floatToIntBits(eSal) == Float.floatToIntBits(other.eSal);
	}
	
	
	

}
