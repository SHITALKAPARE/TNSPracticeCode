package com.dailyassignments;
import java.util.Scanner;
public class Assignment2ATMSys {
	float balance = 100000f;
	public  float  checkBalance() {
		return balance;
	}
	
	public void Withdraw(float amount) {
		if(amount<= balance) {
			balance-=amount;
			System.out.println("withdrawed "+ amount + "rs successfully.");
		}
		else {
			System.out.println("Insufficient balance.");
		}
	}
	
	public void depositmoney(float amount) {
		balance+=amount;
		System.out.println("Amount deposit successful.");
	}
	
	
	public static void main(String[] args) {
		float amount;
		Assignment2ATMSys obj1 = new Assignment2ATMSys();
		try (Scanner sc = new Scanner(System.in)) {
			//performing operations
			while(true) {
				
				int choice;
				System.out.println("Enter your Choice:\n1.Check balance\n2.Withdraw cash\n3.Deposit money\n4.Exit");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println(obj1.checkBalance());
					break;
				case 2:
					System.out.println("Enter amount to be withdrawed");
					amount = sc.nextFloat();
					obj1.Withdraw(amount);
					break;
				case 3:
					System.out.println("Enter amount to be deposited");
					amount = sc.nextInt();
					obj1.depositmoney(amount);
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Invalid choice");
				}
//			
//			System.out.println("Do you want to continue ? (true/false)");
//			again = sc.nextBoolean();		
				}
		}
		
	}

}
