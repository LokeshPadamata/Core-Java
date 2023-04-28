package strings;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		System.out.println("Normal: " + str);
		String reverse = "";
		for(int i=0;i<str.length();i++) {
			reverse = str.charAt(i)+reverse;
		}
		System.out.println("Reverse: " +reverse);
		sc.close();
		}
		
}
