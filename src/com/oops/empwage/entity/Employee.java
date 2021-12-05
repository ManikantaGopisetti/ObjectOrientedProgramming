package com.oops.empwage.entity;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String empName;
	private int empTotalWage;

	private static List<String> dailyWage = new ArrayList<String>();

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpTotalWage() {
		return empTotalWage;
	}

	public void setEmpTotalWage(int empTotalWage) {
		this.empTotalWage = empTotalWage;
	}

	public static List<String> getDailyWage() {
		return dailyWage;
	}

	public static void setDailyWage(List<String> dailyWage) {
		Employee.dailyWage = dailyWage;
	}

	@Override
	public String toString() {
		System.out.println("Employee name: " + empName);
		System.out.println("Daily wages: ");
		for (String string : dailyWage) {
			System.out.println("Employee daily wage: " + string);
		}
		System.out.println("Employee total wage: " + empTotalWage);
		return "Employee details displayed\n\n";
	}
}
