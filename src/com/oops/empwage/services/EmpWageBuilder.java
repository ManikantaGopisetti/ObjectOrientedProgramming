package com.oops.empwage.services;

import java.util.List;
import java.util.Scanner;
import com.oops.empwage.entity.Company;
import com.oops.empwage.entity.CompanyList;
import com.oops.empwage.entity.Employee;

public class EmpWageBuilder implements IWageBuilder {

	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;

	Scanner sc = new Scanner(System.in);

	public void addCompany(List<Company> obj) {

		Company companyEmpWage = new Company();

		System.out.print("Enter the name of Company : ");
		companyEmpWage.setCompName(sc.next());

		System.out.print("Enter max working days of Company : ");
		companyEmpWage.setMaxWorkingDays(sc.nextInt());

		System.out.print("Enter max working hours of Company : ");
		companyEmpWage.setMaxWorkingHours(sc.nextInt());

		System.out.print("Enter wage per hour of Company : ");
		companyEmpWage.setWagePerHour(sc.nextInt());

		companyEmpWage.setCompTotalwage(employeeWage(companyEmpWage)); // calculating total wage for this obj

		obj.add(companyEmpWage);

		CompanyList.setCompanyList(obj);
		sc.nextLine(); // Consume newline left-over by Enter key

	}

	public void display(List<Company> obj) {
		for (Company EmpWage : obj) {
			System.out.println(EmpWage);
		}

	}

	public void getEmployee(List<Company> obj) {
		List<Employee> employees = Company.getEmployees();
		System.out.println("Enter company name of employee to get total Wage: ");
		String empName = sc.next();
		for (Company companyEmpWage : obj) {
			for (Employee employee : employees) {
				if (empName.equals(employee.getEmpName())) {
					System.out.println("Employee is working in company :" + companyEmpWage.getCompName());
					System.out.println(employee);
					return;
				}
			}
		}
		System.out.println("No employee found with given name");

	}

	public void getCompany(List<Company> obj) {
		System.out.println("Enter company name to get total Wage: ");
		String compName = sc.next();
		for (Company companyEmpWage : obj) {
			if (companyEmpWage.getCompName().equals(compName)) {
				System.out.println(companyEmpWage);
				return;
			}
		}
		System.out.println("No company found with given name");

	}

	public int employeeWage(Company companyEmpWage) {
		List<Employee> employees = Company.getEmployees();
		int compTotalWage = 0;
		System.out.println("Enter no of employees in company : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Employee employee = new Employee();
			System.out.println("Enter name of employee : ");
			employee.setEmpName(sc.next());

			int hours = 0;
			int noOfWorkDays = 0;
			int noOfWorkHours = 0;
			int totalWage = 0;
			int count = 0;
			List<String> dailyWage = Employee.getDailyWage();

			while (noOfWorkHours < companyEmpWage.getMaxWorkingHours()
					&& noOfWorkDays < companyEmpWage.getMaxWorkingDays()) {

				int attendanceCheck = (int) Math.floor((Math.random() * 10) % 3);

				switch (attendanceCheck) {

				case IS_FULL_TIME:
					hours = 8;
					if (noOfWorkHours + hours > companyEmpWage.getMaxWorkingHours()) {
						count++;
						break;
					}
					// System.out.println("employee is present and full time");
					noOfWorkHours += hours;
					noOfWorkDays++;
					dailyWage.add("full time: " + hours * companyEmpWage.getWagePerHour());
					break;

				case IS_PART_TIME:
					hours = 4;
					if (noOfWorkHours + hours > companyEmpWage.getMaxWorkingHours()) {
						count++;
						break;
					}
					// System.out.println("employee is present and part time");
					noOfWorkHours += hours;
					noOfWorkDays++;
					dailyWage.add("part time: " + hours * companyEmpWage.getWagePerHour());
					break;

				default:
					// System.out.println("employee is absent");
					hours = 0;
					noOfWorkDays++;
					dailyWage.add("absent: " + hours * companyEmpWage.getWagePerHour());
					break;
				}
				if (count == 1) {
					break;
				}
				int dailyEmpWage = hours * companyEmpWage.getWagePerHour();
				// System.out.println("daily emp wage= " + dailyEmpWage);
				// System.out.println(noOfWorkDays);
				// System.out.println(noOfWorkHours);

				totalWage = totalWage + dailyEmpWage;
			}
			employee.setEmpTotalWage(totalWage);
			employees.add(employee);
			compTotalWage = compTotalWage + totalWage;
		}
		return compTotalWage;

	}

}
