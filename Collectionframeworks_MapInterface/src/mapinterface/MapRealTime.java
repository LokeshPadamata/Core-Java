package mapinterface;
import java.util.HashMap;
class Customer{
	private String id;
	private String name;
	private long acbalance;
	private String address;
	public Customer(String id,String name,long acbalance,String address) {
		this.id = id;	
		this.name = name;
		this.acbalance = acbalance;
		this.address = address;
	}	
	public String toString() {
		return this.id + "\t" + this.name + "\t" + this.acbalance + "\t"+ this.address ;
	}
}	

public class MapRealTime {

	public static void main(String[] args) {
		Customer c1 = new Customer("1","sai",50000,"Hyderabad");
		Customer c2 = new Customer("2","kiran",10000,"Hyderabad");
		Customer c3 = new Customer("3","Raju",20000,"Hyderabad");
		HashMap<Integer,Customer> hashmap = new HashMap<Integer,Customer>();
		hashmap.put(1, c1);
		hashmap.put(2, c2);
		hashmap.put(3, c3);
		System.out.println(hashmap);
	}

}
