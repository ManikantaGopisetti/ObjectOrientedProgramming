package com.oops.empwage.entity;

public class Employee {

	String name;
	private int max_working_days;
	private int max_working_hours;
	private int wage_per_hour;

	public Employee(String name, int max_working_days, int max_working_hours, int wage_per_hour) {
		super();
		this.name = name;
		this.max_working_days = max_working_days;
		this.max_working_hours = max_working_hours;
		this.wage_per_hour = wage_per_hour;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMax_working_days() {
		return max_working_days;
	}

	public void setMax_working_days(int max_working_days) {
		this.max_working_days = max_working_days;
	}

	public int getMax_working_hours() {
		return max_working_hours;
	}

	public void setMax_working_hours(int max_working_hours) {
		this.max_working_hours = max_working_hours;
	}

	public int getWage_per_hour() {
		return wage_per_hour;
	}

	public void setWage_per_hour(int wage_per_hour) {
		this.wage_per_hour = wage_per_hour;
	}
}