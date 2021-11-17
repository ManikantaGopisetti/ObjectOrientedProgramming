package com.oops.empwage.entity;

import com.oops.empwage.services.EmpWageBuilder;

public class EmpWage {
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");
		EmpWageBuilder ewb = new EmpWageBuilder();
		ewb.addCompany();

	}
}
