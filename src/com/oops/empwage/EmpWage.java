package com.oops.empwage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpWage {
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		List<CompanyWage> companies = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of companies to add: ");
		int nComp = sc.nextInt();

		for (int i = 0; i < nComp; i++) {
			CompanyWage obj = new CompanyWage();
			obj.addComp();
			companies.add(obj);
		}
		
		while (true) {
			System.out.println("Enter your choice:\n 1.Add company\n 2.Display list of companies toalwage\n 3.Display paricular company total wage\n 4.Exit");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Adding new company");
				CompanyWage obj = new CompanyWage();
				obj.addComp();
				companies.add(obj);
				break;

			case 2:
				System.out.println("Display list of companies total wage");
				for (CompanyWage companyWage : companies) {
					System.out.println(companyWage);
				}
				break;

			case 3:
				System.out.println("Display required company total wage using company name");
				String name = sc.next();
				for (int i = 0; i < nComp; i++) {
					obj = companies.get(i);
					if (obj.getCompName().equals(name)) {
						System.out.println(obj);
					}
				}
				break;
				
			case 4:
				System.out.println("exit employee wage program");
				sc.close();
				return;

			default:
				System.out.println("enter valid choice between 1 to 4");
				break;
			}
		}	
	}
}
