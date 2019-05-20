package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;
import dao.DaoClass;

public class ServiceClass implements EmployeeService {
	DaoClass dao = new DaoClass();
	@Override
public void storeIntoMap(int id,Employee employee){
		dao.storeIntoMap(id,employee);
		
	}
	public void getScheme(int scheme,String scheme2) {
		if(scheme>5000&&scheme<20000 && scheme2.equals("System Associate")){
			System.out.println("SCheme C");
			
		}
		else if(scheme>=20000&&scheme<40000&&scheme2.equals("Programmer")) {
			System.out.println("Scheme B");
		}
		else if(scheme>=40000&&scheme2.equals("Programmer")) {
			System.out.println("Scheme A");
		}
		else if(scheme<5000&&scheme2.equals("Clerk")) {
			System.out.println("No Scheme");
		}
		else {
			System.out.println("Null");
		}
		
		
	}
	
	public void setScheme(int newsal,String designation,Employee employee) {
		if(newsal>5000&&newsal<20000 && designation.equals("System Associate")){

			employee.setinsuranceScheme("Scheme C");
							
						}
						else if(newsal>=20000&&newsal<40000&&designation.equals("Programmer")) {
							employee.setinsuranceScheme("Scheme B");
						}
						else if(newsal>=40000&&designation.equals("Manager")) {
							employee.setinsuranceScheme("Scheme A");
						}
						else if(newsal<5000&&designation.equals("Clerk")) {
							employee.setinsuranceScheme("No Scheme");
						}
						else {
							employee.setinsuranceScheme("Null");
						}
	}

@Override
public boolean checkId(int id) {
return dao.checkId(id);
	
}

	@Override
	public Map<Integer, Employee> displayEmployee() {
		
		return  dao.displayEmployee();
	}
}
