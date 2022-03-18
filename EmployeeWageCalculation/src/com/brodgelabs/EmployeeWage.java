package com.brodgelabs;

import java.util.ArrayList;

class EmployeeWage implements EmpWage{

	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;

	ArrayList<CompanyEmpWage> companies;

	public EmployeeWage()
	{
		companies = new ArrayList<>();
	}

	public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
	{
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
		companies.add(companyEmpWage);
	}

	int generateEmployeeType()
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

	public void calculateTotalWage()
	{
		for (CompanyEmpWage company : companies)
		{
			int totalWage = calculateTotalWage(company);
			company.setTotalEmployeeWage(totalWage);
			System.out.println(company);
		}
	}

	int calculateTotalWage(CompanyEmpWage companyEmpWage)
	{
		System.out.println("\nComputation of total wage of " + companyEmpWage.companyName + " employee");
		System.out.println("");
		System.out.println("Day		Workinghrs	Wage		Total Working Hrs \n ");

		int workingHrs, totalWage = 0;
		for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.maxWorkingDays
				&& totalWorkingHrs <= companyEmpWage.maxWorkingHrs; day++, totalWorkingHrs += workingHrs)
		{
			int empType = generateEmployeeType();
			workingHrs = getWorkingHrs(empType);
			int wage = workingHrs * companyEmpWage.wagePerHr;
			totalWage += wage;
			System.out.println(day+"		" +workingHrs +"		"+wage+"		"+(totalWorkingHrs + workingHrs));
		}
		return totalWage;
	}
}

