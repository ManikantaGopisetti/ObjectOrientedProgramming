package com.oops.empwage.services;

import java.util.List;

import com.oops.empwage.entity.Company;

public interface IWageBuilder {

	public abstract void addCompany(List<Company> obj);

	public abstract void display(List<Company> obj);

	public abstract void getCompany(List<Company> obj);

	public abstract void getEmployee(List<Company> obj);

	public abstract int employeeWage(Company companyEmpWage);

}