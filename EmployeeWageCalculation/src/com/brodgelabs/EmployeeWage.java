package com.brodgelabs;

public class EmployeeWage {
	static final int IS_FULL_TIME=1;
	static final int IS_PART_TIME=2;

	int checkAttendance(int i) {
		int value = (int)Math.floor(Math.random()*10) % 3;
		switch(value) {
		case IS_FULL_TIME:{
			System.out.println("Employee is Present Full Time");
			break;
		}
		case IS_PART_TIME:{
			System.out.println("Employee is Present Part Time");
			break;
		}
		default: System.out.println("Employee is Absent ....");
		}
		return value;
	}

	static int monthlyWage(int i,int attendance, int wagePerHour, int fullTimeEmpHrs, int partTimeEmpHrs) {
		switch(attendance) {
		case 1:
			int empWage = wagePerHour * fullTimeEmpHrs; 
			System.out.println("Wage is : " +empWage);
			return empWage;
		case 2:
			empWage = wagePerHour * partTimeEmpHrs;	
			System.out.println("Wage is : " +empWage);
			return empWage;
		default:
			System.out.println("No Wage as Employee is absent..... ");
			return 0;
		}
	}
}