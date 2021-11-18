package com.oops.empwage.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {

	String name;

	private int max_working_days;
	private int max_working_hours;
	private int wage_per_hour;

	int total_wage;

	public static List<String> dailyWage = new ArrayList<String>();

	public CompanyEmpWage(String name, int max_working_days, int max_working_hours, int wage_per_hour) {
		super();
		this.name = name;
		this.setMax_working_days(max_working_days);
		this.setMax_working_hours(max_working_hours);
		this.setWage_per_hour(wage_per_hour);
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

	public static List<String> getDailyWage() {
		return dailyWage;
	}

	public static void setDailyWage(List<String> dailyWage) {
		CompanyEmpWage.dailyWage = dailyWage;
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

	@Override
	public String toString() {
		
		System.out.println("Company name: "+name);
		System.out.println("Daily wages: ");
		for (String string : dailyWage) {
			System.out.println(string);
		}
		System.out.println("Total wage: "+total_wage);
		return  "Company detais displayed";
		
	}

}