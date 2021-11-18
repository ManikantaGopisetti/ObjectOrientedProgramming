package com.oops.empwage.entity;

import java.util.List;
import java.util.Scanner;

import com.oops.empwage.services.EmpWageBuilder;
import com.oops.empwage.services.WageBuilder;

public class EmpWage {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Employee Wage Computation Program");
		WageBuilder ewb = new EmpWageBuilder();
		System.out.println("Enter no of companies to add: ");
		int nComp = sc.nextInt();
		List<CompanyEmpWage> obj = CompanyList.getCompanyList();
		for (int i=0;i<nComp;i++) {
			System.out.println("Enter detais of Company : ");
			ewb.addCompany(obj);
		}
		while (true) {
			System.out.println("Enter your choice :\n 1.Add Company\n 2.Display total Wages\n 3.Exit program ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter detais of Company : ");
				ewb.addCompany(obj);
				break;
				
			case 2:
				System.out.println("Total wage of all companies: ");
				ewb.display(obj);
				break;
				
			case 3:
				System.out.println("Exiting Employee Wage Computation Program ");
				sc.close();
				return;

			}
		}

	}
}
