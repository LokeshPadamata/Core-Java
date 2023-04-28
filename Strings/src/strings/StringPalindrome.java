package strings;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		str = str.toUpperCase();
		System.out.println("Normal: " + str);
		String reverse = "";
		for(int i=0;i<str.length();i++) {
			reverse = str.charAt(i)+reverse;
		}
		System.out.println("Reverse: " +reverse);
		if(str.contentEquals(reverse)) {
			System.out.println("It' A Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		sc.close();
	}
	
}

