package com.oops.empwage.services;

import java.util.List;

import com.oops.empwage.entity.CompanyEmpWage;

public interface WageBuilder {

	public abstract  void addCompany(List<CompanyEmpWage> obj);

	public abstract void display(List<CompanyEmpWage> obj);

	public abstract int employeeWage();

}