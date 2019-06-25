package com.ibm.mra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.ibm.mra.beans.Account;
import com.ibm.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
	

	private static AccountDaoImpl dao;
	
	
	
	
	@Autowired
	@Qualifier("dao")
	public void setDao(AccountDaoImpl dao) {
		System.out.println("setDao");
		this.dao = dao;
		

	}

	public Account getAccountDetails(String mobileNo) {
		
		System.out.println("getAccountDetails mobileNo: " + mobileNo);
		Account user=AccountServiceImpl.dao.getAccountDetails(mobileNo);
		if(user==null) {
			return null;
		}
		return user;
	}

	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		int stat=dao.rechargeAccount(mobileNo,rechargeAmount);
		if(stat==0) {		
		return 0;
		}
		else {
			return 1;
		}
	}

}
