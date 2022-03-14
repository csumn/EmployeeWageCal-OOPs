package com.brodgelabs;

public class EmployeeWage {
	static final int IS_FULL_TIME=1;
	static final int IS_PART_TIME=2;

	static void dailyWage(int wagePerHour, int fullTimeEmpHrs, int partTimeEmpHrs) {
		int value = (int)Math.floor(Math.random()*10) % 3;
		int empWage=0;
		switch(value) {
		case IS_FULL_TIME:{
			empWage = wagePerHour * fullTimeEmpHrs; 
			System.out.println("Employee is Present Full Day and Wage is : " +empWage);
			break;
		}
		case IS_PART_TIME:{
			empWage = wagePerHour * partTimeEmpHrs;
			System.out.println("Employee is Present Half Day and Wage is : " +empWage);
			break;
		}
		default: 
			System.out.println("Employee is Absent today, as the reason today's wage is : "+empWage);
		}
	}
}
