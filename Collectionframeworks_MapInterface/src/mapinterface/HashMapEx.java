package mapinterface;
import java.util.HashMap;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Varun");
		hm.put(2, "Sm");
		hm.put(3, "Eswar");
		hm.put(4, "Tej");
		hm.put(5, "Sai");
		System.out.println(hm);
		System.out.println(hm.get(4));

	}

}
