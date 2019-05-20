package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface EmployeeService {

	void storeIntoMap(int id,Employee person);

	Map<Integer,Employee> displayEmployee();
	void getScheme(int scheme,String scheme2);
	void setScheme(int id,String des,Employee employee);
	boolean checkId(int id);
}
