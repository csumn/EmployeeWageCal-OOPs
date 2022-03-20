package com.brodgelabs;

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		EmployeeWage employeeWageComputation = new EmployeeWage();
		employeeWageComputation.addCompany("Amazon", 300, 25, 200);
		employeeWageComputation.addCompany("FaceBook", 300, 25, 200);
		employeeWageComputation.addCompany("Microsoft", 280, 28, 200);
		System.out.println("");
		employeeWageComputation.calculateTotalWage();
		employeeWageComputation.displayTotalEmpWages();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the company name to check the Employee wage : ");
		String companyName = sc.nextLine();
		Integer totalEmpWage = employeeWageComputation.getCompanyEmpWage(companyName);
		if (totalEmpWage != null)
			System.out.println("Monthly employee wage of " + companyName + "Employee is " + totalEmpWage);
		else
			System.out.println("No such company added ");
		sc.close();
	}
}