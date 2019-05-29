package com.ibm.mra.ui;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.ibm.mra.beans.Account;
import com.ibm.mra.service.AccountServiceImpl;

public class MainUi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String mobileNo = "";
		double rechargeAmount = 0.0;
		AccountServiceImpl accountService = new AccountServiceImpl();
		while (true) {
			try {
				System.out.println("Press 1. For Recharge Account ");
				System.out.println("Press 2. For Account Balance Enquiry");
				System.out.println("Press 3. Exit");
				int choice = scan.nextInt();
				if (choice == 1) {

					while (true) { // This Lopp Will run until user enters a valid number and the number is
									// validated by the validateMobileNumer(String number) method
						System.out.println("Enter a Mobile Numebr To Recharge");
						mobileNo = scan.next();
						boolean flag = MainUi.validateMobileNumber(mobileNo);
						if (flag) {
							continue;
						} else {
							break;
						}
					}
					while (true) {
						System.out.println("Enter Amount To Recharge");

						boolean flag = false;
						try {
							rechargeAmount = scan.nextDouble();
							flag = MainUi.validateBalance(rechargeAmount);
						} catch (Exception e) {
							System.out.println("Enter a valid Amount");
							main(new String[] {});
						}
						if (flag) {
							continue;
						} else {
							break;
						}
					}
					int status = accountService.rechargeAccount(mobileNo, rechargeAmount);
					if (status == 0) {
						System.out.println("Recharge Scucessful!!");
						main(new String[] {});
					} else {
						System.out.println("FAiled!! Account No Doest Not Exist");
						main(new String[] {});
					}
				}

				else if (choice == 2) {// This Loop Will run until user enters a valid number and the number is
										// validated by the validateBalance(Double amount) method
					while (true) {
						System.out.println("Enter a valid mobile number");
						mobileNo = scan.next();
						boolean flag = MainUi.validateMobileNumber(mobileNo);
						if (flag) {
							continue;
						} else {
							break;
						}

					}
					Account user = accountService.getAccountDetails(mobileNo);
					System.out.println(user.getAccountBalance());
				}

				else if (choice == 3) { // this is to exit the user form the app
					System.exit(0);
				}

				else {
					System.out.println("Enter a Valid option from above");
					main(new String[] {});
				}
			} catch (Exception e) { // Catching the exceptions from the main options
				System.out.println("Enter a valid respons from above");
				main(new String[] {});
			}

		}
	}

	public static boolean validateMobileNumber(String mobileNumber) { // This is used to validate mobile number
		Pattern pattern = Pattern.compile("[0-9]+");
		if (pattern.matcher(mobileNumber).matches()) {
			if (mobileNumber.length() < 10) {
				return true;
			} else {
				return false;
			}
		}

		return true;

	}

	public static boolean validateBalance(Double balance) {

		if (balance.isNaN()) {
			return true;
		}

		return false;

	}

}
