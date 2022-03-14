package com.brodgelabs;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int totalWage = 0;
		System.out.println("Welcome to EmployeeWage Computation..... \n");
		EmployeeWage employeeWage = new EmployeeWage();
		System.out.println("Enter below details \n  Employee Wage per hour \n  Employee Full Time Hour \n  Part Time Hour");
		Scanner scanner = new Scanner(System.in);
		int wagePerHour = scanner.nextInt();
		int fullTimeEmpHrs = scanner.nextInt();
		int partTimeEmpHrs = scanner.nextInt();
		for (int i =1;i<=20;i++) {
			int attendance = employeeWage.checkAttendance(i);
			int monthly = EmployeeWage.monthlyWage(i,attendance,wagePerHour,fullTimeEmpHrs,partTimeEmpHrs);
			totalWage = monthly + totalWage;
			System.out.println("Wage till date " + i + " is " +totalWage);
		}
		System.out.println("Monthly wage is : " +totalWage);
		scanner.close();
	}
}
