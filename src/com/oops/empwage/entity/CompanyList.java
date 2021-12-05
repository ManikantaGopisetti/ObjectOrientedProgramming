package com.oops.empwage.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyList {

	public static List<Company> companyList = new ArrayList<Company>();

	public static List<Company> getCompanyList() {
		return companyList;
	}

	public static void setCompanyList(List<Company> companyList) {
		CompanyList.companyList = companyList;
	}

}
