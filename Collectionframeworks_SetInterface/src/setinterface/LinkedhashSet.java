package setinterface;
import java.util.LinkedHashSet;
public class LinkedhashSet {

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add(3);
		lhs.add(2);
		lhs.add(3);        ///Duplicate Entries are not considered even though we entered
		lhs.add(true);
		lhs.add(3);
		lhs.add("hi");
		lhs.add(1);
		System.out.println(lhs);
		lhs.remove(1);
		System.out.println(lhs);
	}

}
