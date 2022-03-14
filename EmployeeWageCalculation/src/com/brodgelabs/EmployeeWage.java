package com.brodgelabs;

public class EmployeeWage {

	static void dailyWage(int wagePerHour, int empHrs) {
		int isPresent = 1;
		int value = (int)Math.floor(Math.random()*10) % 2;
		if(value == isPresent) {
			int empWage = wagePerHour * empHrs; 
			System.out.println("Employee is Present and Wage is :" +empWage);
		}else
			System.out.println("Employee is absent today.....");
	}
}
