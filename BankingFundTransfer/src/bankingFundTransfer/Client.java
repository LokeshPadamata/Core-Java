package bankingFundTransfer;

public class Client {

	public static void main(String[] args) {
		Customer account1 = new Customer("Varun","100","Hyderabad",97453224,50000 ,"ICICI","Madhapur","ICIC002354","current");
		Customer account2 = new Customer("SM","101","Hyderabad",95623224,30000 ,"ICICI","Madhapur","ICIC002354","savings");
		Customer account3 = new Customer("Varun","101","Hyderabad",95623334,10000 ,"ICICI","Madhapur","ICIC002354","savings");
		account1.fundTransfer(account3,3000);
		System.out.println(account1.accbalance);
		System.out.println(account3.accbalance);
		account2.fundTransfer(account1,3000);
		System.out.println(account1.accbalance);
		System.out.println(account2.accbalance);


	}

}
