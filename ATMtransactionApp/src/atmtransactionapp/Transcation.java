package atmtransactionapp;

import java.util.Scanner;

public class Transcation extends CustomerCredentials {
	
	public void withdrawl(long amount) {
		if(amount >= 100) {
			acbalance = acbalance-amount;
			System.out.println("Remaining Balance is: " + acbalance);
		}
		else {
			System.out.println("Amount should be greater than or equals 100");
		}
		}
	public void deposit(long amount) {
		if(amount >= 100) {
			acbalance = acbalance+amount;
			System.out.println("Remaining Balance is: " + acbalance);
		}
		else {
			System.out.println("Amount should be greater than or equals 100");
		}
		}
	public void balanceEnquiry() {
		System.out.println("Your Account Balance is: " + acbalance);
	}
	public void pinchange() {
		System.out.println("Enter new pin");
		Scanner p = new Scanner(System.in);
		int newpin = p.nextInt();
		if(pin != newpin) {
			System.out.println("Pin Change Succesful");
		}
		p.close();
	}
	
}
