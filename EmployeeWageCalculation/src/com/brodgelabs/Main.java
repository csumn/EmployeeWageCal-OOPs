package com.brodgelabs;

public class Main {

	public static void main(String args[])
	{
		EmployeeWage employeeWage = new EmployeeWage();
		employeeWage.calculateTotalWage("Amazon", 200, 20, 180);
		employeeWage.calculateTotalWage("Delloite", 150, 20, 200);
	}
}
