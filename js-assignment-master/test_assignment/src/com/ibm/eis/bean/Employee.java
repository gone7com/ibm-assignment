package com.ibm.eis.bean;

public class Employee {
	
	
	private String name;
	private int id;
	private int salary;
	private String designation;
	private String insuranceScheme;    
					
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getinsuranceScheme() {
		return insuranceScheme;
	}
	public void setinsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public String toString() {
		return "Person [id="+id+"name=" + name + ", salary = " + salary + " designation = "+designation+" insuranceScheme= "+ insuranceScheme +"]";
	}
	

}
