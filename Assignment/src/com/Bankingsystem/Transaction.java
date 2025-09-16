package com.Bankingsystem;

public class Transaction  extends Account{

	public final static int tansactionFee = 10;
	public double transactionAmount;
	
	public Transaction(String accountHolder,long accountNumber,double balance,double amount) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transactionAmount = amount;
		super.showBankDetails();
		super.showAccountInfo();
	}

	public final void performTransaction() {
		if((transactionAmount+tansactionFee)<balance) {
			this.balance-=(transactionAmount+tansactionFee);
		System.out.println("Transcation of amount "+ transactionAmount +" is successful.\n");
	}else {
		System.out.println("Insufficient balance\n"+"Balance :"+balance+"\nTransaction Amount: "+transactionAmount);
	}
}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		
	}}