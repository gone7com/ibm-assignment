package com.ibm.mra.beans;

public class Account {
	private String AccountType;
	private String customerName;
	private double accountBalance;
	
	public Account(String AccountType,String customerName,double accountBalance) {
		this.AccountType=AccountType;
		this.customerName=customerName;
		this.accountBalance=accountBalance;
		
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
