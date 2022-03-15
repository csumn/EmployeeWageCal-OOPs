package com.brodgelabs;

public class EmployeeWage {

	static final int WAGE_PER_HOUR_IS = 20;
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int MAX_WORKING_DAYS = 20;
	static final int MAX_WORKING_HRS = 100;

	void calculateWage() {
		int total_Employee_Wage = 0;
		int working_Hrs = 0;
		int working_Days = 1;

		while (working_Hrs < MAX_WORKING_HRS && working_Days <= MAX_WORKING_DAYS) {

			int value = (int)Math.floor(Math.random()*10) % 3;
			if(working_Hrs >= 96 && value == IS_FULL_TIME) {
				System.out.println("Max hours reached!!! You can only do Part Time Work");
			}
			else{
				switch (value) {
				case IS_FULL_TIME: {
					int empHrs = 8;
					int empWage = WAGE_PER_HOUR_IS * empHrs; 
					total_Employee_Wage=total_Employee_Wage+empWage;
					working_Hrs+= empHrs;
					System.out.println("Employee is Present Full time and will receive " +WAGE_PER_HOUR_IS*empHrs+ " and working hours is "+working_Hrs+ " Working day is " +working_Days);
					working_Days++;
					break;
				}
				case IS_PART_TIME: {
					int empHrs = 4;
					int empWage = WAGE_PER_HOUR_IS * empHrs; 
					total_Employee_Wage=total_Employee_Wage+empWage;
					working_Hrs+=empHrs;
					System.out.println("Employee is Present Part time and will receive " +WAGE_PER_HOUR_IS*empHrs+ " and working hours is "+working_Hrs+ " Working day is "+ working_Days);
					working_Days++;
					break;
				}
				default:
					System.out.println("Employee is Absent ....and working day is " +working_Days);	
					working_Days++;
				}
			}
		}
		System.out.println("Total Wage of the Employee in a Month is : " +total_Employee_Wage);
	}
}