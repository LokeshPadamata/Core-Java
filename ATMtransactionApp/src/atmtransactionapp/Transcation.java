package atmtransactionapp;

import java.util.Scanner;

public class Transcation extends CustomerCredentials {
	
	public void withdrawl(long amount) {
		acbalance = acbalance-amount;
		System.out.println("Remaining Balance is: " + acbalance);
	}
	public void deposit(long amount) {
		acbalance = acbalance+amount;
		System.out.println("Remaining Balance is: " + acbalance);
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
