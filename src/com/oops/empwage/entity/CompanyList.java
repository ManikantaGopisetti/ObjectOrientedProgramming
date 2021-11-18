package com.oops.empwage.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyList {
	
	public static List<CompanyEmpWage> companyList= new ArrayList<CompanyEmpWage>();

	public static List<CompanyEmpWage> getCompanyList() {
		return companyList;
	}

	public static void setCompanyList(List<CompanyEmpWage> companyList) {
		CompanyList.companyList = companyList;
	}

	

	
}
