package controlstatements;
import java.util.Scanner;
public class IfElseStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		if(username.contentEquals("digital") && password.contentEquals("123")) {
			System.out.println("Login Succesful");
		}
		else {
			System.out.println("Login Failure");
		}
		sc.close();
	}

}

