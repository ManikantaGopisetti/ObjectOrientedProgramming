package com.oops.empwage.entity;

import java.util.ArrayList;
import java.util.List;

public class Company {

	String compName;

	private int maxWorkingDays;
	private int maxWorkingHours;
	private int wagePerHour;
	private int compTotalwage;

	static List<Employee> employees = new ArrayList<Employee>();

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public int getMaxWorkingDays() {
		return maxWorkingDays;
	}

	public void setMaxWorkingDays(int maxWorkingDays) {
		this.maxWorkingDays = maxWorkingDays;
	}

	public int getMaxWorkingHours() {
		return maxWorkingHours;
	}

	public void setMaxWorkingHours(int maxWorkingHours) {
		this.maxWorkingHours = maxWorkingHours;
	}

	public int getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(int wagePerHour) {
		this.wagePerHour = wagePerHour;
	}

	public int getCompTotalwage() {
		return compTotalwage;
	}

	public void setCompTotalwage(int compTotalwage) {
		this.compTotalwage = compTotalwage;
	}

	public static List<Employee> getEmployees() {
		return employees;
	}

	public static void setEmployees(List<Employee> employees) {
		Company.employees = employees;
	}

	@Override
	public String toString() {

		System.out.println("Company name: " + compName);
		System.out.println("Company Total wage: " + compTotalwage);
		return "Company detais displayed\n\n";

	}

}