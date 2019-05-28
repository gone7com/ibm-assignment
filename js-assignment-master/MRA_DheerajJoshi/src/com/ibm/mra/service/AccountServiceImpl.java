package com.ibm.mra.service;

import com.ibm.mra.beans.Account;
import com.ibm.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
	AccountDaoImpl dao = null;

	public AccountServiceImpl() {
		dao = new AccountDaoImpl();
	}

	@Override
	public Account getAccountDetails(String mobileNo) {

		Account user = dao.getAccountDetails(mobileNo);
		if (user == null) {
			return null;
		}
		return user;
	}

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		int stat = dao.rechargeAccount(mobileNo, rechargeAmount);
		if (stat == 0) {
			return 0;
		} else {
			return 1;
		}
	}

}
