package constructors;
class BankDetails{
	String Bankname;
	String branch;
	public BankDetails(String Bankname,String branch) {
		this.Bankname = Bankname;
		this.branch = branch;
	}
}
class Accholder extends BankDetails{
	String name;
	String Accnumber;
	long Accbalance;
	public Accholder(String name,String Accnumber,long Accbalance,String Bankname,String branch) {
		super(Bankname,branch);
		this.name = name;
		this.Accnumber = Accnumber;
		this.Accbalance = Accbalance;
		this.Bankname = Bankname;
		this.branch = branch;
		
	}
}
public class ConstructorInheritanceRealtime {

	public static void main(String[] args) {
		Accholder customer1 = new Accholder("Varun","123456",505434,"SBI","Madhapur");
		Accholder customer2 = new Accholder("Eswar","67890",31423,"SBI","Madhapur");
		System.out.println(customer1.name + "\t" +customer1.Accnumber);
		System.out.println(customer2.name + "\t" +customer2.Accbalance);

	}

}
