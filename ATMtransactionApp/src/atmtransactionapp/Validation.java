package atmtransactionapp;
import java.util.Scanner;
public class Validation {
	
	public static void main(String[] args) {
		CustomerCredentials cred = new CustomerCredentials();
		Transcation t = new Transcation();
		System.out.println("Welcome to SBI ATM \t Enter your Card");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin");
		int yourpin= sc.nextInt();
		if(yourpin == cred.pin) {
			System.out.println("Choose an option");
			Scanner s = new Scanner(System.in);
			System.out.println("1.Withdrawl \t 2.Deposit \t 3.Balance Enquiry \t 4.Pin Change");
			int choice = s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter amount in 100s 200s 500s 2000s");
				int amount =sc.nextInt();
				t.withdrawl(amount);
				break;
			case 2:
				System.out.println("Enter amount");
				int amount1 =sc.nextInt();
				t.deposit(amount1);
				break;
			case 3:
				t.balanceEnquiry();
				break;
			case 4:
				t.pinchange();
			}
		s.close();	
		}
		else {
			System.out.println("You have Entered Incorrect Pin");
		}
		
		sc.close();	
	}
}
