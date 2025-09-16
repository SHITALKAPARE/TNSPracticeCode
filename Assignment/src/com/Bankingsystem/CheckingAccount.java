package com.Bankingsystem;

public class CheckingAccount extends  Account{
	
	
	
	public CheckingAccount(String accountHolder,long accountNumber,double balance) {
		super();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Checking Account");
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;	
		super.showBankDetails();
		super.showAccountInfo();
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;	
		System.out.println("Deposit of amount "+ amount + " Successful." );
		System.out.println("Current Balance: "+this.balance+"\n");		
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount<=this.balance) {
			this.balance-=amount;
			System.out.println("Withdrawed amount : "+ amount +"\nAvailable balance is: "+this.balance+"\n");
		}else {
			System.out.println("Available Balance: "+this.balance);	
			System.out.println("Can not withraw amount"+amount+" \n");
		}		
	}
	
	@Override
	public void getBalance() {
		System.out.println("Available Balance: "+this.balance+"\n");	
	}
	
	

}