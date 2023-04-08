package controlstatements;
import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		System.out.println("1-python  2-C  3-C++  4-java");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
	    
		switch(choice){
			case 1 : 
				System.out.println("you have chosen python");
				break;
				
			case 2 :
				System.out.println("you have chosen html");
				break;
				
			case 3 :
				System.out.println("you have chosen C");
				break;
			case 4 :
				System.out.println("you have chosen Java");
				break;
			default :
				System.out.println("Wrong Choice");
	}
	sc.close();
}
}
