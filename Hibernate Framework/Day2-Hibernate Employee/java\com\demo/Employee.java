package com.demoo;


import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "Employee_Table")

public class Employee {
	
@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
private int eId;

@Column(name="eName", nullable=false, length=50)
private String eName;

@Column(name="eSal", nullable=false, length=7)
private float eSal;

@Column(unique = true)
private String eMailId;

@Transient
private float bonus;

public Employee()
{
	
}

public Employee(int eId, String eName, float eSal, String eMailId, float bonus) {
	super();
	this.eId = eId;
	this.eName = eName;
	this.eSal = eSal;
	this.eMailId = eMailId;
	this.bonus = bonus;
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

public String geteMailId() {
	return eMailId;
}

public void seteMailId(String eMailId) {
	this.eMailId = eMailId;
}

public float getBonus() {
	return bonus;
}

public void setBonus(float bonus) {
	this.bonus = bonus;
}

@Override
public int hashCode() {
	return Objects.hash(bonus, eId, eMailId, eName, eSal);
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
	return Float.floatToIntBits(bonus) == Float.floatToIntBits(other.bonus) && eId == other.eId
			&& Objects.equals(eMailId, other.eMailId) && Objects.equals(eName, other.eName)
			&& Float.floatToIntBits(eSal) == Float.floatToIntBits(other.eSal);
}

@Override
public String toString() {
	return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", eMailId=" + eMailId + ", bonus=" + bonus
			+ "]";
}



	
	


}
