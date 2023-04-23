package mapinterface;
import java.util.Hashtable;

public class HashTableEx  {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm = new Hashtable<Integer, String>();
		hm.put(1, "ls");       
		hm.put(2, "ks");        
		hm.put(3, "js");
		hm.put(4, "hs");
		hm.put(5, "gs");
		System.out.println(hm);
		System.out.println(hm.get(4));

	}

}
