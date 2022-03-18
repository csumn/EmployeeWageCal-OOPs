package com.brodgelabs;

public interface EmpWage {

	public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);
	public void calculateTotalWage();

}
