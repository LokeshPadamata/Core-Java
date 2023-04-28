package constructors;

class Customer{
	int cid;
	String name;
	long accbalance;
}
public class DefaultConstructor {

	public static void main(String[] args) {
		Customer c1 = new Customer();    //Calling the default constructor
		c1.cid = 101;
		c1.name = "varun";
		c1.accbalance = 10000;
		System.out.println(c1.accbalance);

	}

}
