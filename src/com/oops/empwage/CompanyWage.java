package com.oops.empwage;

import java.util.Scanner;

public class CompanyWage {
	private int totalWage;
	public String getCompName() {
		return CompName;
	}
	public void setCompName(String compName) {
		CompName = compName;
	}
	private String CompName;
	
	Scanner sc = new Scanner(System.in);

	
	public void addComp() {
		
		System.out.print("Enter the name of Company : ");
		String name = sc.nextLine();
		
		System.out.print("Enter max working days of Company : ");
		int max_working_days=sc.nextInt();
		
		System.out.print("Enter max working hours of Company : ");
		int max_working_hours=sc.nextInt();
		
		System.out.print("Enter wage per hour of Company : ");
		int wage_per_hour=sc.nextInt();
		
		EmployeeWageComputation ec = new EmployeeWageComputation(name, max_working_days, max_working_hours, wage_per_hour);
		int wagePerMonth = ec.employeeWage();
		totalWage= wagePerMonth;
		CompName=name;
	}
	@Override
	public String toString() {
		return "CompanyWage [totalWage=" + totalWage + ", CompanyName=" + CompName + "]";
	}
	
}
