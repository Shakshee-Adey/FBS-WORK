package com.demoo;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Project_Table")

public class Project {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;

	@Column(name="pName", nullable=false, length=50)
	private String pName;

	@Column(name="frontEnd", nullable=false, length=70)
	private String frontEnd;
	
	@Column(name="backEnd", nullable=false, length=80)
	private String backEnd;
    

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pId, String pName, String frontEnd, String backEnd) {
		super();
		this.pId = pId;
		this.pName = pName;
		frontEnd = frontEnd;
		backEnd = backEnd;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getFrontEnd() {
		return frontEnd;
	}

	public void setFrontEnd(String frontEnd) {
		frontEnd = frontEnd;
	}

	public String getBackEnd() {
		return backEnd;
	}

	public void setBackEnd(String backEnd) {
		backEnd = backEnd;
	}

	@Override
	public int hashCode() {
		return Objects.hash(backEnd, frontEnd, pId, pName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(backEnd, other.backEnd) && Objects.equals(frontEnd, other.frontEnd)
				&& pId == other.pId && Objects.equals(pName, other.pName);
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", Frontend=" + frontEnd + ", BackendTech="
				+ backEnd + "]";
	}
	
	
}
