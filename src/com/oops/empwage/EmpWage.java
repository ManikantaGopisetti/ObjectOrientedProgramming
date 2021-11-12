package com.oops.empwage;

import java.util.Scanner;

public class EmpWage {
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of Companies : ");
		int nComp=sc.nextInt();
		EmployeeWageComputation ec = new EmployeeWageComputation();
		
		
		for(int i=0;i<nComp;i++) {
			sc.nextLine(); //Consume newline left-over by Enter key

			System.out.print("Enter the name of Company : ");
			String name = sc.nextLine();
			
			System.out.print("Enter max working days of Company : ");
			int max_working_days=sc.nextInt();
			
			System.out.print("Enter max working hours of Company : ");
			int max_working_hours=sc.nextInt();
			
			System.out.print("Enter wage per hour of Company : ");
			int wage_per_hour=sc.nextInt();
			
			int wagePerMonth = ec.employeeWage(name, max_working_days,max_working_hours,wage_per_hour);
			System.out.println("Employee wage per month= "+wagePerMonth);
		}
		
		sc.close();
		
	}

	
}
