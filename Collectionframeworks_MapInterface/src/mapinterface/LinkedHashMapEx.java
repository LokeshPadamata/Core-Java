package mapinterface;
import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		hm.put(1, "Varun");       
		hm.put(2, "Sm");        
		hm.put(3, "Eswar");
		hm.put(4, "Tej");
		hm.put(5, "Sai");
		System.out.println(hm);
		System.out.println(hm.get(4));

	}

}
