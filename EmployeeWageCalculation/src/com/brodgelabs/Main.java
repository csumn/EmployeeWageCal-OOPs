package com.brodgelabs;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to EmployeeWage Computation..... \n");
		System.out.println("Enter \n  Employee Wage per hour \n  Employee Hours");
		Scanner scanner = new Scanner(System.in);
		int wagePerHour = scanner.nextInt();
		int empHrs = scanner.nextInt();
		EmployeeWage.dailyWage(wagePerHour,empHrs);
		scanner.close();
	}
}
