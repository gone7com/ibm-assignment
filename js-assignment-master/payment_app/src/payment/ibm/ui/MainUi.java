package payment.ibm.ui;

import java.util.Scanner;
import java.util.regex.Pattern;

import payment.ibm.service.serviceClass;

public class MainUi {

	public static void main(String[] args) {
		System.out.println("Press 1 To create User Account");
		System.out.println("Press 2. To Deposit Money");
		System.out.println("Press 3.To withdraw money from account");
		System.out.println("Press 4.To Transfer money from account");
		System.out.println("Press 5.To check statment of any account");
		Scanner scan = new Scanner(System.in);
		serviceClass service= new serviceClass();
				try {
							int choice=scan.nextInt();
							if(choice==1) {
								scan.nextLine();
								
										System.out.println("Enter the name of the user");	
										String nameofuser="";
										long phoneno=0L;
								
										while(true) {
										 nameofuser=scan.nextLine();
										boolean flag=new MainUi().validateusername(nameofuser);
										if(flag) {
											break;
										}
										else {
											System.out.println("Enter a valid username for bank");
										}
										}
										System.out.println("Enter Phone no of user");
										while(true) {
										String phone=scan.next();
											
										if(new MainUi().validatephonenumber(phone)) {
											phoneno=Long.parseLong(phone);
											break;
										}
										else {
											System.out.println("Enter a valid phone number");
										}
											
										}
										System.out.println("Enter address of user");
										scan.nextLine();
										String address=scan.nextLine();
										
										service.createAcount(nameofuser,phoneno,address);
			
						    }
							if(choice==2) {
								scan.nextLine();
								System.out.println("Enter the account number you want to deposit into");
								long newaccountno=0L;
								while(true) {
								String accountno1=scan.next();
								if(new MainUi().validatephonenumber(accountno1)) {
									newaccountno=Long.parseLong(accountno1);
								break;
								
								}
								else {
									System.out.println("Enter a valid account no ");
							
								}
								}
								System.out.println("Enter the amount you want to deposit into");
								long amount=0L;
								while(true) {
									 String amount1=scan.next();
									if(new MainUi().validatephonenumber(amount1)) {
										newaccountno=Long.parseLong(amount1);
									break;
									
									}
									else {
										System.out.println("Enter a valid amount ");
								
									}
									}
								service.depositMoney(newaccountno,amount);
								
								
							}
							if(choice==3) {
								scan.nextLine();
								System.out.println("Enter the account number you want to withdraw from");
							
								long accountno=0L;
								while(true) {
									 String account1=scan.next();
									if(new MainUi().validatephonenumber(account1)) {
										accountno=Long.parseLong(account1);
									break;
									
									}
									else {
										System.out.println("Enter a valid account no ");
								
									}
									}
							
								System.out.println("Enter the amount you want to withdraw");
								
								long amount = 0L;
								while(true) {
									 String amount1=scan.next();
									if(new MainUi().validatephonenumber(amount1)) {
										amount=Long.parseLong(amount1);
									break;
									
									}
									else {
										System.out.println("Enter a valid amount ");
								
									}
									}
							
								service.withdraw(accountno,amount);
							}
							if(choice==4) {
								scan.nextLine();
								System.out.println("Enter the account number you want to transfer from");
								
								long accountno=0L;
								while(true) {
									 String account1=scan.next();
									if(new MainUi().validatephonenumber(account1)) {
										accountno=Long.parseLong(account1);
									break;
									
									}
									else {
										System.out.println("Enter a valid account number to withdraw from ");
								
									}
									}
							
								System.out.println("Enter the account number you want to transfer into");
								long getterno=0L;
								while(true) {
									 String account1=scan.next();
									if(new MainUi().validatephonenumber(account1)) {
										getterno=Long.parseLong(account1);
									break;
									
									}
									else {
										System.out.println("Enter a valid account number to transfer into");
								
									}
									}
							
								
								System.out.println("Enter the amount you want to withdraw");
								long amount = 0L;
								while(true) {
									 String amount1=scan.next();
									if(new MainUi().validatephonenumber(amount1)) {
										amount=Long.parseLong(amount1);
									break;
									
									}
									else {
										System.out.println("Enter a valid amount ");
								
									}
									}
							
								service.fundTransfer(accountno, getterno, amount);
							}
							
							
							if(choice==5) {
								scan.nextLine();
								System.out.println("Enter the account number you want to check transaction for");
								long accountno=scan.nextLong();
								
								
								System.out.println("Enter the type of statment you want");
								System.out.println("Press 1. to check the mini statement");
								System.out.println("Press 2. to check the  statement according to money transfer");
								System.out.println("Press 3. to check the  statement according to type of money transfer");
								
								long statementchoice=scan.nextLong();
								if(statementchoice==1) {
									service.printTransactions(accountno,statementchoice,0L);	
								}
								else if(statementchoice==2) {
									System.out.println("Enter the minimum transaction amount");
									long transactionlimit=scan.nextLong();
									service.printTransactions(accountno,statementchoice,transactionlimit);
								}
								else if(statementchoice==3) {
									System.out.println("Enter d for money deposited");
									System.out.println("Enter w for money withdrawl");
									System.out.println("Enter f for money transfer");
								
								String charchoice=scan.next();
								service.printTransactions(accountno,statementchoice,charchoice);
								}
								
								
								
							}
							
							
							
							else {
								main(new String[] {"sda","asd"} );
							}
							
							}
				catch (Exception e) {
				System.out.println("Enter options from above");
				main(new String[] {"sda","asd"} );
			
			// TODO: handle exception
				}
		
		
	}
	
	public boolean validateusername(String name) {
		Pattern pattern = Pattern.compile("[A-Za-z]+");
		if(pattern.matcher(name).matches()) {
			return true;
		}
		
		return false;
	} 
	
	public boolean validatephonenumber(String phoneno )
	{
		Pattern pattern = Pattern.compile("[0-9]+");
		if(pattern.matcher(phoneno).matches()) {
			return true;
		}
		
		return false;

	}

}
