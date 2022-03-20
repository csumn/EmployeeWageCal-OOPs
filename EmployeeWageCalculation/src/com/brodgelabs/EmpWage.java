package com.brodgelabs;

interface EmpWage {
	public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);
	public void calculateTotalWage();
	public Integer getCompanyEmpWage(String companyName);
}
