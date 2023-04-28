package setinterface;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		 HashSet<Object> hashset = new HashSet<Object>();
		 hashset.add(100);
		 hashset.add(200);
		 hashset.add(100);      ///Duplicate Entries Are Considered
		 hashset.add("hello");
		 hashset.add(10);
		 hashset.add(20);
		 System.out.println(hashset.isEmpty());
		 System.out.println(hashset);
		 hashset.remove("hello");
		 System.out.println(hashset);
		 System.out.println(hashset.size());
	}

}
