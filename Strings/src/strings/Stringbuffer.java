package strings;

public class Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Lokesh");
		System.out.println(str);
		str.append(" Padamata");   //String Buffer is mutable and threadsafe(synchronized) 
		System.out.println(str);
		
		
		StringBuilder str1 = new StringBuilder("Hello");
		System.out.println(str1);
		str1.append(" World");   //String Builder is mutable and not threadsafe(not synchronized) 
		System.out.println(str1);
	}
}