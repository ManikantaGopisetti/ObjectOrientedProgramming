package com.oops.empwage;

public class EmpWage {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWageComputation ec = new EmployeeWageComputation();
		int wagePerMonth = ec.employeeWage();
		System.out.println("Employee wage per month= "+wagePerMonth);
		
	}

	
}
