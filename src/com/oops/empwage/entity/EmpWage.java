package com.oops.empwage.entity;

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
		CompanyEmpWage[] obj = new CompanyEmpWage[nComp];
		ewb.addCompany(obj);
		sc.close();

	}
}
