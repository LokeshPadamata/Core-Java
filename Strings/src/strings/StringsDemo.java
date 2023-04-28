package strings;

public class StringsDemo {

	public static void main(String[] args) {
		String firstname = new String("Lokesh"); //Using new keyword
		String lastname = new String("Padamata");
		firstname.concat(lastname);
		System.out.println(firstname);  //(output:Lokesh) because strings are immutable in Java
		String fullname = firstname.concat(lastname);
		System.out.println(fullname); //(output:Lokesh) because not updating,storing in another string
	}

}
