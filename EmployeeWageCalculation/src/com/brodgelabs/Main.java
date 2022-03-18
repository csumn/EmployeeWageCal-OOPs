package com.brodgelabs;

public class Main {
	
	public static void main(String args[])
	{
		EmployeeWage employeeWageComputation = new EmployeeWage();
		employeeWageComputation.addCompany("Amazon ", 300, 25, 200);
		employeeWageComputation.addCompany("FaceBook ", 300, 25, 200);
		employeeWageComputation.addCompany("Microsoft ", 280, 28, 200);
		System.out.println("");
		employeeWageComputation.calculateTotalWage();
	}
}
