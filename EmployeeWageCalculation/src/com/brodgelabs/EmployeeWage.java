package com.brodgelabs;

public class EmployeeWage {

	public void calculateTotalWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
	{
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME  = 2;
		int totalWage = 0;
		int workingHrs = 0;

		System.out.println( companyName + " Employee details");
		System.out.println(" ");
		System.out.println("Day		Workinghrs	Wage		Total Working Hrs \n ");

		for (int day = 1, totalWorkingHrs = 0; day <= maxWorkingDays && totalWorkingHrs <= maxWorkingHrs; day++, totalWorkingHrs += workingHrs)
		{
			int empType = (int) (Math.random() * 100) % 3;
			switch (empType)
			{
			case IS_FULL_TIME:
				workingHrs = 8;
				break;
			case IS_PART_TIME:
				workingHrs = 4;
				break;
			default:
				workingHrs = 0;
				break;
			}
			int wage = workingHrs * wagePerHr;
			totalWage += wage;
			System.out.println(day+"		" +workingHrs +"		"+wage+"		"+(totalWorkingHrs + workingHrs));
		}
		System.out.println("");
		System.out.println("Total wage of " +companyName+ " employee is " + totalWage + "\n");
	}
}
