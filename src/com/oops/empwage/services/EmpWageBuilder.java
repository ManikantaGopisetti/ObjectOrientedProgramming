package com.oops.empwage.services;

import java.util.List;
import java.util.Scanner;

import com.oops.empwage.entity.CompanyEmpWage;
import com.oops.empwage.entity.CompanyList;

public class EmpWageBuilder implements WageBuilder {

	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;

	String name;
	int max_working_days;
	int max_working_hours;
	int wage_per_hour;

	Scanner sc = new Scanner(System.in);

	public void addCompany(List<CompanyEmpWage> obj) {

		System.out.print("Enter the name of Company : ");
		name = sc.nextLine();

		System.out.print("Enter max working days of Company : ");
		max_working_days = sc.nextInt();

		System.out.print("Enter max working hours of Company : ");
		max_working_hours = sc.nextInt();

		System.out.print("Enter wage per hour of Company : ");
		wage_per_hour = sc.nextInt();
		
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(name, max_working_days, max_working_hours, wage_per_hour);
		
		companyEmpWage.setTotal_wage(employeeWage()); 			// calculating total wage for this obj
		
		obj.add(companyEmpWage);
		
		CompanyList.setCompanyList(obj);
		sc.nextLine(); // Consume newline left-over by Enter key

	}

	public void display(List<CompanyEmpWage> obj) {
		for (CompanyEmpWage EmpWage : obj) {
			System.out.println(EmpWage);
		}

	}

	public int employeeWage() {

		int hours = 0;
		int noOfWorkDays = 0;
		int noOfWorkHours = 0;
		int totalWage = 0;
		int count = 0;
		
		List<String> dailyWage = CompanyEmpWage.getDailyWage();

		while (noOfWorkHours < max_working_hours && noOfWorkDays < max_working_days) {

			int attendanceCheck = (int) Math.floor((Math.random() * 10) % 3);

			switch (attendanceCheck) {

			case IS_FULL_TIME:
				hours = 8;
				if (noOfWorkHours + hours > max_working_hours) {
					count++;
					break;
				}
				// System.out.println("employee is present and full time");
				noOfWorkHours += hours;
				noOfWorkDays++;
				dailyWage.add("full time: "+hours * wage_per_hour);
				break;

			case IS_PART_TIME:
				hours = 4;
				if (noOfWorkHours + hours > max_working_hours) {
					count++;
					break;
				}
				// System.out.println("employee is present and part time");
				noOfWorkHours += hours;
				noOfWorkDays++;
				dailyWage.add("part time: "+hours * wage_per_hour);
				break;

			default:
				// System.out.println("employee is absent");
				hours = 0;
				noOfWorkDays++;
				dailyWage.add("absent: "+hours * wage_per_hour);
				break;
			}
			if (count == 1) {
				break;
			}
			int dailyEmpWage =hours * wage_per_hour;
			// System.out.println("daily emp wage= " + dailyEmpWage);
			// System.out.println(noOfWorkDays);
			// System.out.println(noOfWorkHours);
			

			totalWage = totalWage + dailyEmpWage;
		}

		return totalWage;

	}

}
