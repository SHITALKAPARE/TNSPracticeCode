package com.Bankingsystem;

public class BankSystemDemo {
	public static void main(String[] args) {


		//Saving Account methosds
		SavingAccount sAcc = new SavingAccount("Shital",12345678910l,20000);
		sAcc.getBalance();
		sAcc.deposit(5000);
		sAcc.withdraw(26000);
		System.out.println("----------------------------------------------------------------------");
		
		//Checking account
		CheckingAccount cAcc = new CheckingAccount("Neha",1222233345678l,40000);
		cAcc.getBalance();
		cAcc.deposit(5000);
		cAcc.withdraw(26000);		
		System.out.println("----------------------------------------------------------------------");
		
		//Transaction class 
		Transaction t = new Transaction("Shivani",123456780l,100000,1000.0);
		t.performTransaction();
		System.out.println("----------------------------------------------------------------------");
		
	}

}
