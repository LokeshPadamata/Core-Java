package exceptionhandling;
import java.util.Scanner;
public class NullPointerException_Unchecked {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int a = sc.nextInt();
		System.out.println("Enter seond Number");
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		
		try {
			int c= a/b;
			System.out.println(c);
		}
		catch(ArithmeticException exception) {
			System.out.println(exception);
		}
		int d = a+b;
		System.out.println(d);
		System.out.println("done");
		sc.close();
		s.close();
	}
	
}
