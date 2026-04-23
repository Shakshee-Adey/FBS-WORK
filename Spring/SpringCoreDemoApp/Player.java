package com.ash.demo;

import java.util.Objects;

public class Player {
	
	int jersyNo;
	String name;
	int runs;
	int wickets;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int jersyNo, String name, int runs, int wickets) {
		super();
		this.jersyNo = jersyNo;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
	}
	public int getJersyNo() {
		return jersyNo;
	}
	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	@Override
	public int hashCode() {
		return Objects.hash(jersyNo, name, runs, wickets);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return jersyNo == other.jersyNo && Objects.equals(name, other.name) && runs == other.runs
				&& wickets == other.wickets;
	}
	@Override
	public String toString() {
		return "Player [jersyNo=" + jersyNo + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + "]";
	}
	
	

}
