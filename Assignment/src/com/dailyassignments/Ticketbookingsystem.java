package com.dailyassignments;
import java.util.Scanner;
public class Ticketbookingsystem {
	@SuppressWarnings("unused")
	private static Scanner sc;
	private String stageEvent;
	private String customer;
	private Integer noOfSeats;
	
	
	public Ticketbookingsystem() {
		super();
	}

	public Ticketbookingsystem(String stageEvent, String customer, Integer  noOfSeats) {
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	
	public void makePayment(double amount) {
		System.out.println("Stage Event : "+this.stageEvent+"\nCustomer : "+this.customer+"\nNumber of seats : "+noOfSeats+"\nAmount "+amount+" Paid in cash");
		
	}
	
	public void makePayment(String walletNo, double amount) {
		System.out.println("Stage Event : "+stageEvent+"\nCustomer : "+this.customer+"\nNumber of seats : "+noOfSeats+"\nAmount "+amount+" Paid using wallet number "+walletNo);
	}
	
	public void makePayment(String creditCard, String ccv, String name, double amount) {
		System.out.println("Stage Event : "+stageEvent+"\nCustomer : "+this.customer+"\nNumber of seats : "+noOfSeats+"\nHolder name : "+name+"\nAmount "+amount+" Paid using "+creditCard+" card"+ "\nCCV : "+ccv );
	}
	
	public static void main(String[] args) {
		Integer amount;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("stageEvent ,customer and noOfSeats seperated by comma :\n");
		String inputLine = sc.nextLine();
		String[] values = inputLine.split(",");	
		Ticketbookingsystem ticket = new Ticketbookingsystem(values[0],values[1],Integer.parseInt(values[2]));
		
		System.out.println("Payment mode. If \n1. Cash payment, \n2.Wallet payment \n3.Credit card payment.");
		int mode = sc.nextInt();

		switch(mode) {
		case 1:
			System.out.println("Enter ticket price : ");
			amount = sc.nextInt();
			ticket.makePayment(amount);
			break;
		case 2:
			System.out.println("Enter :\n1.Ticket price.\n2.Wallet number.");
			amount = sc.nextInt();
			String walletNo = sc.next();
			ticket.makePayment(walletNo, amount);
			break;
		case 3:
			System.out.println("Enter :\n1.Credit card holder name.\n2.Ticket price.\n3.Credit card type.\n4.CCV number.");
			String creditCardHolder = sc.next();
			amount = sc.nextInt();
			String creditCardType = sc.next();
			String ccv = sc.next();
			ticket.makePayment(creditCardType, ccv, creditCardHolder, amount);
			break;
		default:
		
		}
	}

}