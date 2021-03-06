package com.brodgelabs;

class CompanyEmpWage{
	String companyName;
	final int wagePerHr;
	final int maxWorkingDays;
	final int maxWorkingHrs;
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

