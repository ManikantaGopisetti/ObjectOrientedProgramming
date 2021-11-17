package com.oops.empwage.entity;

public class CompanyEmpWage {

	String name;
	private int max_working_days;
	private int max_working_hours;
	private int wage_per_hour;

	int total_wage;

	public CompanyEmpWage(String name, int max_working_days, int max_working_hours, int wage_per_hour) {
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

	public int getTotal_wage() {
		return total_wage;
	}

	public void setTotal_wage(int total_emp_wage) {
		this.total_wage = total_emp_wage;
	}

	@Override
	public String toString() {
		return "CompanyEmpWage [Company_name=" + name + ", total_wage=" + total_wage + "]";
	}

}