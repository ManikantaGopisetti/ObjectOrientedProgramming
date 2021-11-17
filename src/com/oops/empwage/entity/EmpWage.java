package com.oops.empwage.entity;

import java.util.List;
import java.util.Scanner;
import com.oops.empwage.services.EmpWageBuilder;

public class EmpWage {
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of companies to add: ");
		int nComp = sc.nextInt();
		int saveWage[] = new int[nComp];

		for (int i = 1; i <= nComp; i++) {

			sc.nextLine(); // Consume newline left-over by Enter key

			System.out.print("Enter the name of Company " + i + ": ");
			String name = sc.nextLine();

			System.out.print("Enter max working days of Company : ");
			int max_working_days = sc.nextInt();

			System.out.print("Enter max working hours of Company : ");
			int max_working_hours = sc.nextInt();

			System.out.print("Enter wage per hour of Company : ");
			int wage_per_hour = sc.nextInt();

			Employee e = new Employee(name, max_working_days, max_working_hours, wage_per_hour);
			EmpWageBuilder ewb = new EmpWageBuilder(e);
			int totalWage = ewb.employeeWage();
			System.out.println("Total wage of company " + name + " is: " + totalWage);
			saveWage[i - 1] = totalWage; // saving total wage for each company in an array

		}

		for (int j = 1; j <= saveWage.length; j++) {
			System.out.println("Total wage of company " + j + " is: " + saveWage[j - 1]);
		}
		sc.close();

	}
}
