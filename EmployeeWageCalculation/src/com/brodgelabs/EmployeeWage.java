package com.brodgelabs;

public class EmployeeWage {

	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	String companyName;
	int wagePerHr;
	int maxWorkingDays;
	int maxWorkingHrs;
	int totalWage = 0;

	EmployeeWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
	{
		this.companyName = companyName;
		this.wagePerHr = wagePerHr;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHrs = maxWorkingHrs;
	}

	int EmployeeType()
	{
		return (int) (Math.random() * 100) % 3;
	}

	int getWorkingHrs(int empType)
	{
		switch (empType)
		{
		case IS_FULL_TIME:
			return 8;
		case IS_PART_TIME:
			return 4;
		default:
			return 0;
		}
	}

	void calculateTotalWage()
	{
		System.out.println( companyName + " Employee details");
		System.out.println(" ");

		System.out.println("Day		Workinghrs	Wage		Total Working Hrs \n ");
		int workingHrs;
		for (int day = 1, totalWorkingHrs = 0; day <= maxWorkingDays
				&& totalWorkingHrs <= maxWorkingHrs; day++, totalWorkingHrs += workingHrs)
		{
			int empType = EmployeeType();
			workingHrs = getWorkingHrs(empType);
			int wage = workingHrs * wagePerHr;
			totalWage += wage;
			System.out.println(day+"		" +workingHrs +"		"+wage+"		"+(totalWorkingHrs + workingHrs));
		}

	}
	void display() {
		System.out.println("");
		System.out.println("Total wage of " +companyName+ " employee is " + totalWage + "\n");
		System.out.println( " ");
	}
}
