package listinterface;
import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>(); 
		al.add(100);
		al.add(200);
		al.add(10);
		al.add("hello");
		al.add(50);
		al.add(200);
		al.add(200);
		al.add(30);
		System.out.println(al);
		System.out.println("--------------------------");
		al.remove(6);
		al.remove(5);
		al.remove(2);
		al.add(2, "hi");
		System.out.println(al);
	}

}
