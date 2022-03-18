package com.brodgelabs;

public class CompanyEmpWage {
	String companyName;
	int wagePerHr;
	int maxWorkingDays;
	int maxWorkingHrs;
	int totalWage;

	CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
	{
		this.companyName = companyName;
		this.wagePerHr = wagePerHr;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHrs = maxWorkingHrs;
		totalWage = 0;
	}

	void setTotalEmployeeWage(int totalEmpWage)
	{
		this.totalWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "CompanyEmpWage [companyName = " + companyName + ", totalWage = " + totalWage + "]";
	}
}

