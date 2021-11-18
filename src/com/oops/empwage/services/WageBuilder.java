package com.oops.empwage.services;

import com.oops.empwage.entity.CompanyEmpWage;

public interface WageBuilder {

	public abstract  void addCompany(CompanyEmpWage[] obj);

	public abstract void display(CompanyEmpWage[] obj);

	public abstract int employeeWage();

}