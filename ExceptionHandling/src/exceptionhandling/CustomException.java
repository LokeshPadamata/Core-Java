package exceptionhandling;
import java.util.Scanner;
public class CustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		try {
			if(str.length()<8) {
				System.out.println("Password should not contain lessthan 8 charecter");
			}
			
		}
		catch(Exception custom) {
			System.out.println(custom);
		}
		sc.close();
	}

}
