package constructors;
class Customers{
	 int cid;
	 String name;
	 long accountBalance;
	 String idProof; 
	 String dobCertificate;
	 public Customers(int cid,String name,long accountBalance,String idProof) {
		 super();
		 this.cid = cid;
		 this.name = name;
		 this.accountBalance = accountBalance;
		 this.idProof = idProof;
	 }
	 public Customers(int cid,String name,long accountBalance,String idProof,String dobCertificate) {
		 super();
		 this.cid = cid;
		 this.name = name;
		 this.accountBalance = accountBalance;
		 this.idProof = idProof;
		 this.dobCertificate = dobCertificate;
	 }
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Customers c1 = new Customers(100,"Varun",909678,"Aadhar Card");
		Customers c2 = new Customers(100,"Varun",909678,"Aadhar Card","dobCertificate");
		System.out.println(c1.name);
		System.out.println(c2.cid);
	
	}

}
