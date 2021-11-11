package com.oops.empwage;

public class EmpWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		// Check Employee is Present or Absent UC-1
		int is_full_time = 1;
		int is_part_time = 2;
		int wagePerHour = 20;
		int hours = 0;
		int attendanceCheck = (int) Math.floor((Math.random() * 10) % 3);

		if (attendanceCheck == is_full_time) {
			System.out.println("employee is present and full time");
			hours = 8;
		} else if (attendanceCheck == is_part_time) {
			System.out.println("employee is present and part time");
			hours = 4;
		} else {
			System.out.println("employee is absent");

		}
		// Calculate Daily Employee Wage UC-2

		int dailyEmpWage = hours * wagePerHour;
		System.out.println("daily employee wage =" + dailyEmpWage);
		
		//Add Part time Employee & Wage UC-3
	}

}