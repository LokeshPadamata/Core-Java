package onlineShoppingPaymentApp;
import java.util.Scanner;
class CreditCard{
	String nameoncard;
	long accno;
	int cvv;
	public CreditCard(String nameoncard,long accno,int cvv) {
		super();
		this.nameoncard = nameoncard;
		this.accno = accno;
		this.cvv = cvv;
	}
}
class DebitCard{
	String nameonCard;
	long accNo;
	int cVV;
	public DebitCard(String nameonCard,long accNo,int cVV) {
		super();
		this.nameonCard = nameonCard;
		this.accNo = accNo;
		this.cVV = cVV;
	}
}
class PhonePay{
	long mobileNo;
	String qrCode;
	public PhonePay(long mobileNo, String qrCode) {
		super();
		this.mobileNo = mobileNo;
		this.qrCode = qrCode;
	}	
}
class CashOnDelivery{
	String adress;
	String contactno;
	public CashOnDelivery(String adress, String contactno) {
		super();
		this.adress = adress;
		this.contactno = contactno;
	}
}

class Payment{
	public void pay(CreditCard creditcard) {
		System.out.println("You Have Chosen Credit Card and Details are: ");
		System.out.println(creditcard.nameoncard);
		System.out.println(creditcard.accno);
		System.out.println(creditcard.cvv);
	}
	public void pay(DebitCard debitcard) {    // Method Overloading
		System.out.println("You Have Chosen Debit Card and Details are: ");
		System.out.println(debitcard.nameonCard);
		System.out.println(debitcard.accNo);
		System.out.println(debitcard.cVV);
		
	}
	public void pay(PhonePay phonepay) {
		System.out.println("You Have Chosen Phone Pay and Details are: ");
		System.out.println(phonepay.mobileNo);
		System.out.println(phonepay.qrCode);
	}
	public void pay(CashOnDelivery cashondelivery) {
		System.out.println("You Have Chosen CashOnDelivery and Details are: ");
		System.out.println(cashondelivery.adress);
		System.out.println(cashondelivery.contactno);
		
	}
}
public class OnlinePaymentApp {
	public static void main(String[] args) {
		Payment payment = new Payment();
		Scanner sc = new Scanner(System.in);
		System.out.println("Payment Modes");
		System.out.println(" 1.Credit Card \n 2.Debit Card \n 3.Phone Pay \n 4.Cash On Delivery ");
		System.out.println("Enter your payment method");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				
				System.out.println("Enter Below Details");
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter nameoncard:");
				String nameoncard = scan.nextLine();
				System.out.println("Enter accno:");
				long accno = scan.nextLong();
				System.out.println("Enter cvv:");
				int cvv = scan.nextInt();
				CreditCard creditcard = new CreditCard(nameoncard,accno,cvv);
				payment.pay(creditcard);break;
			case 2:
				System.out.println("Enter Below Details:-");
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter nameoncard:");
				String nameonCard = sc1.nextLine();
				System.out.println("Enter accno:");
				long accNo = sc1.nextLong();
				System.out.println("Enter cvv:");
				int cVV = sc1.nextInt();
				DebitCard debitcard = new DebitCard(nameonCard,accNo,cVV);
				payment.pay(debitcard);break;
			case 3:
				System.out.println("Enter Below Details:");
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter Mobile No:");
				long mobileNo = sc2.nextLong();
				System.out.println("Enter qrCode:");
				String qrCode = sc2.nextLine();
				PhonePay phonepay = new PhonePay(mobileNo,qrCode);
				payment.pay(phonepay);break;	
			case 4:
				System.out.println("Enter Below Details:");
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Enter adress:");
				String adress = sc3.nextLine();
				System.out.println("Enter contactno:");
				String contactno = sc3.nextLine();
				CashOnDelivery cashondelivery = new CashOnDelivery(adress,contactno);
				payment.pay(cashondelivery);
				
		}
		sc.close();
	}
}
