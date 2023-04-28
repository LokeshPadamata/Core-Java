package exceptionhandling;
import java.util.Scanner;
public class SpaceNotAllowedException {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		String str = l.nextLine();
		try {
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==' ') {
					System.out.println("Space not allowed");
				}
			}
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
		System.out.println("Done");
		l.close();
	}
	
}
