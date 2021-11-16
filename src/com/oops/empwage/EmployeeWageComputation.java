package com.oops.empwage;

public class EmployeeWageComputation {

	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;
	
	String name;
	int max_working_days;
	int max_working_hours;
	int wage_per_hour;

	public EmployeeWageComputation(String name, int max_working_days, int max_working_hours, int wage_per_hour) {
		super();
		this.name = name;
		this.max_working_days = max_working_days;
		this.max_working_hours = max_working_hours;
		this.wage_per_hour = wage_per_hour;
	}

	public int employeeWage() {

		int hours = 0;
		int noOfWorkDays = 0;
		int noOfWorkHours = 0;
		int totalWage = 0;
		int count=0;

		while (noOfWorkHours < max_working_hours && noOfWorkDays < max_working_days) {

			int attendanceCheck = (int) Math.floor((Math.random() * 10) % 3);

			switch (attendanceCheck) {
			
			case IS_FULL_TIME:
				hours = 8;
				if (noOfWorkHours + hours > max_working_hours) {
					count++;
					break;
				}
				//System.out.println("employee is present and full time");
				noOfWorkHours += hours;
				noOfWorkDays++;
				break;

			case IS_PART_TIME:
				hours = 4;
				if (noOfWorkHours + hours > max_working_hours) {
					count++;
					break;
				}
				//System.out.println("employee is present and part time");
				noOfWorkHours += hours;
				noOfWorkDays++;
				break;

			default:
				//System.out.println("employee is absent");
				hours = 0;
				noOfWorkDays++;
				break;
			}
			if(count==1) {
				break;
			}
			int dailyEmpWage = hours * wage_per_hour;
			//System.out.println("daily emp wage= " + dailyEmpWage);
			//System.out.println(noOfWorkDays);
			//System.out.println(noOfWorkHours);

			totalWage = totalWage + dailyEmpWage;
		}

		return totalWage;

	}
}
