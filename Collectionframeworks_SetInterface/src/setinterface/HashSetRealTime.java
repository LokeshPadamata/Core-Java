package setinterface;
import java.util.HashSet;

class Customer{
	String name;
	String cid;
	long acbalance;
	String address;
	public Customer(String name,String cid,long acbalance,String address) {
		super();
		this.name = name;
		this.cid = cid;
		this.acbalance = acbalance;
		this.address = address;
	}
	public String toString() {
		return	this.name + "\t" + this.cid + "\t" + this.acbalance + "\t" + this.address;
	}
	
}
public class HashSetRealTime {

	public static void main(String[] args) {
		Customer c1 = new Customer("varun","101",5000L,"Hyderabad");
		Customer c2 = new Customer("SM","102",4000L,"Hyderabad");
		Customer c3 = new Customer("Eswar","103",3000L,"Hyderabad");
		HashSet<Customer> hashset = new HashSet<Customer>();
		Customer[] customers = {c1,c2,c3};
		for(int i=0;i<customers.length;i++) {
			hashset.add(customers[i]);
		}
		System.out.println(hashset);
	}
}
