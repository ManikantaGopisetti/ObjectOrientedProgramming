package com.oops.empwage;

public class EmpWage {

	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;
	final static int WAGE_PER_HOUR = 20;
	final static int MAX_WORKING_DAYS = 20;

	public static void main(String[] args) {

		int hours = 0;
		int noOfWorkDays = 0;
		int totalWage = 0;

		while (noOfWorkDays < MAX_WORKING_DAYS) {

			int attendanceCheck = (int) Math.floor((Math.random() * 10) % 3);

			switch (attendanceCheck) {

			case IS_FULL_TIME:
				hours = 8;
				System.out.println("employee is present and full time");
				noOfWorkDays++;
				break;

			case IS_PART_TIME:
				hours = 4;
				System.out.println("employee is present and part time");
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

			totalWage += dailyEmpWage;

		}
		System.out.println("total wage per month= " + totalWage);
	}
}
