package com.oops.empwage;

public class EmpWage {

	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;
	final static int WAGE_PER_HOUR = 20;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		// Check Employee is Present or Absent UC-1
		int hours = 0;
		int attendanceCheck = (int) Math.floor((Math.random() * 10) % 3);

		switch (attendanceCheck) {
		case IS_FULL_TIME:
			hours = 8;
			System.out.println("employee is present and full time");
			break;
		case IS_PART_TIME:
			hours = 4;
			System.out.println("employee is present and part time");
			break;
		default:
			System.out.println("employee is absent");
			break;
		}

		// Calculate Daily Employee Wage UC-2

		int dailyEmpWage = hours * WAGE_PER_HOUR;
		System.out.println("daily employee wage =" + dailyEmpWage);

		// Add Part time Employee & Wage UC-3

		// Solving using Switch Case Statement UC-4
	}

}