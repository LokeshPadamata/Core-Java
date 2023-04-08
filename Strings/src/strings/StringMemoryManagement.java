package strings; 

public class StringMemoryManagement {
	public static void main(String[] args) {
		String s1 = new String("Digitallync");  //stored heap area
		String s2 = new String("Digitallync");  //stored heap area
		System.out.println(s1.contentEquals(s2));   //comparing the content in strings
		System.out.println(s1==s2);   //comparing address of objects stored in memory location
		
		
		String s3 = "Digitallync"; //String constant pool
		String s4 = "Digitallync"; //String constant pool
		System.out.println(s3==s4);
		System.out.println(s3==s2);
		
		String s5="hello";
		String s6="hello";
		System.out.println(s5==s6);
		s5 = s5.concat("world");   //s5 = helloworld
		String s7 = "helloworld";
		System.out.println(s5==s7);  //s5 is modified so address  will be changed
		
	}
}
