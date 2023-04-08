package inheritance;

class Bank{
	String bankName = "State Bank of India";
	String branch = "Durgam Cheruvu";
}
class Accholders extends Bank{
	int cid;
	String name;
	long accBalance;
	public String toString() {
		return this.cid + "\t" +"\t"+this.name+"\t" + this.accBalance + "\t" +this.bankName + "\t" +this.branch;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Accholders customer1 = new Accholders();
		customer1.cid = 100;
		customer1.name = "varun";
		customer1.accBalance = 100000;
		Accholders customer2 = new Accholders();
		customer2.cid = 101;
		customer2.name = "SM";
		customer2.accBalance = 90000;
		System.out.println(customer1.cid + "\t" +customer1.name+"\t"+ customer1.accBalance+"\t"+customer1.bankName+"\t"+customer1.branch);
		System.out.println(customer2.cid + "\t" +customer2.name+"\t"+ customer2.accBalance+"\t"+customer2.bankName+"\t"+customer2.branch);
		

	}

}
