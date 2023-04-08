package bankingFundTransfer;

public class Customer extends Bank {
	public String name;
	public String cid;
	public String adress;
	public long accno;
	public long accbalance;
	public String acctype;
	public Customer(String name, String cid, String adress, long accno, long accbalance,String bankname,String branch,String ifsc,String acctype) {
		super(bankname,branch,ifsc);
		this.name = name;
		this.cid = cid;
		this.adress = adress;
		this.accno = accno;
		this.accbalance = accbalance;
		this.acctype = acctype;
	}	
	void fundTransfer(Customer recieveracc,long amount) {
		if(recieveracc == null) {
			System.out.println("reciever acc invalid");
			return;
		}
		if(amount<=0) {
			System.out.println("Amount cannot be zero");
			return;
		}
		this.accbalance = accbalance - amount; 
		recieveracc.accbalance = recieveracc.accbalance+amount;
	}
	void updateAcc() {
		
		System.out.println(this.accbalance);
		System.out.println();
	}
}

