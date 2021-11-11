package com.oops.empwage;

public class EmpWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		// Check Employee is Present or Absent UC-1
		int is_present = 1;
		int attendanceCheck = (int) Math.floor((Math.random() * 10) % 2);

		if (attendanceCheck == is_present) {
			System.out.println("employee is present");
		} else {
			System.out.println("employee is absent");
		}
	}

}