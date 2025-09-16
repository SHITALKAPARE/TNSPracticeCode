package com.Bankingsystem;

abstract public class Account extends Bank{
	public String accountHolder;
	public long accountNumber;
	public double balance;
	public String bankName = "HDFC Bank";
	public String branch = "Hadapsar";
	
	public Account() {
		super();
	}
	
	public String IFSC = "ABCDEF12345";
	
	//abstract methods
	abstract public void deposit(double amount);
	abstract public void withdraw(double amount);
	abstract public void getBalance();
	
	//cocrete methods
	public void showBankDetails() {
		System.out.println("--------------------------Bank Details----------------------------");
		System.out.println("\t1.Bank Name: "+bankName+"\n\t2.Branh: "+branch+"\n\t3.IFSC Code: "+IFSC+"\n\t4.Total accounts: "+totalAccounts);
		System.out.println("-------------------------------------------------------------------");
	}
	
	//Account details 
	public void showAccountInfo() {
		System.out.println("Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nBalance :"+balance);
	}

}