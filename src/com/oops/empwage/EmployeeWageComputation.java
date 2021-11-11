package com.oops.empwage;

public class EmployeeWageComputation {

	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;
	final static int WAGE_PER_HOUR = 20;
	final static int MAX_WORKING_DAYS = 30;
	final static int MAX_WORKING_HOURS = 100;

	public int employeeWage() {

		int hours = 0;
		int noOfWorkDays = 0;
		int noOfWorkHours = 0;
		int totalWage = 0;

		while (noOfWorkHours < MAX_WORKING_HOURS && noOfWorkDays < MAX_WORKING_DAYS) {

			int attendanceCheck = (int) Math.floor((Math.random() * 10) % 3);

			switch (attendanceCheck) {
			
			case IS_FULL_TIME:
				hours = 8;
				if (noOfWorkHours + hours > MAX_WORKING_HOURS) {
					break;
				}
				System.out.println("employee is present and full time");
				noOfWorkHours += hours;
				noOfWorkDays++;
				break;

			case IS_PART_TIME:
				hours = 4;
				if (noOfWorkHours + hours > MAX_WORKING_HOURS) {
					break;
				}
				System.out.println("employee is present and part time");
				noOfWorkHours += hours;
				noOfWorkDays++;
				break;

			default:
				System.out.println("employee is absent");
				hours = 0;
				noOfWorkDays++;
				break;
			}

			int dailyEmpWage = hours * WAGE_PER_HOUR;
			System.out.println("daily emp wage= " + dailyEmpWage);

			totalWage = totalWage + dailyEmpWage;

		}

		return totalWage;

	}
}
