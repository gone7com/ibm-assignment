package com.ibm.mra.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.ibm.mra.beans.Account;

public class AccountDaoImpl implements AccountDao {

	Map<String, Account> accountEntry;

	public AccountDaoImpl() {
		accountEntry = new HashMap<>();
		accountEntry.put("9010210131", new Account("Prepaid", "Vaishali", 200));
		accountEntry.put("9823920123", new Account("Prepaid", "Megha", 453));
		accountEntry.put("9932012345", new Account("Prepaid", "Vikas", 631));
		accountEntry.put("9010210134", new Account("Prepaid", "Anju", 521));
		accountEntry.put("9010210132", new Account("Prepaid", "Tushar", 632));

	}

	@Override
	public Account getAccountDetails(String mobileNo) { // this method is used to get user details like mobile balance
														// using this method ,it will be called by the service class
		boolean flag = false;
		for (Entry<String, Account> entry : accountEntry.entrySet()) { // here map is traversed using for each loop and
																		// checked if mobile number exist
			if (entry.getKey().equalsIgnoreCase(mobileNo)) { // if number exist we are then print the balance of the
																// user
				double amount = entry.getValue().getAccountBalance();
				System.out.println("Your Account Balance is " + " " + amount);
				return entry.getValue();
			}

		}
		System.out.println("Mobile Number Doesnot Exist");
		return null;
	}

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) { // this method is used to recharge the user
																			// account
		boolean flag = false;
		for (Entry<String, Account> entry : accountEntry.entrySet()) { // here map is traversed using for each loop and
																		// checked if mobile number exist
			if (entry.getKey().equalsIgnoreCase(mobileNo)) { // if number exist we are then update the balance of the
																// user
				double amount = entry.getValue().getAccountBalance();
				amount += rechargeAmount;
				accountEntry.put(mobileNo,
						new Account(entry.getValue().getAccountType(), entry.getValue().getCustomerName(), amount));
				System.out.println(
						"Hello" + " " + entry.getValue().getCustomerName() + " " + "Your Balance is" + " " + amount);
				flag = true;
			}
		}
		if (flag) {
			return 0;
		} else {
			return 1;
		}
	}

}
