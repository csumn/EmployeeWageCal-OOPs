package com.brodgelabs;

public class Main {

	public static void main(String args[])
	{
		EmployeeWage employeeWage = new EmployeeWage("Amazon", 300, 25, 200);
		EmployeeWage employeeWage2 = new EmployeeWage("Delloite", 250, 30, 200);
		EmployeeWage employeeWage3 = new EmployeeWage("Microsoft", 280, 28, 200);

		employeeWage.calculateTotalWage();
		employeeWage.display();

		employeeWage2.calculateTotalWage();
		employeeWage2.display();

		employeeWage3.calculateTotalWage();
		employeeWage3.display();
	}
}
