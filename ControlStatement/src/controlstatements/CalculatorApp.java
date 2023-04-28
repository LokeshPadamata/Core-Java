package controlstatements;
import java.util.Scanner;
public class CalculatorApp {
	public static void main(String[] args) {
		System.out.println("1-Addition,2-Subtraction,3-Multiplication,4-Division,5-Modulo");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter required option");
		int choice = sc.nextInt();
		System.out.println("Always Enter X greater than Y");
		System.out.println("Enter x");
		int x = sc.nextInt();
		System.out.println("Enter y");
		int y= sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("The Result is =" + (x+y));
				break;
			case 2:
				System.out.println("The Subtraction is = "+ (x-y));
				break;
			case 3:
				System.out.println("The Multiplication is = "+ (x*y));
				break;
			case 4:
				System.out.println("The Division is= "+ (x/y));
				break;
			case 5:
				System.out.println("The Modulo is= "+(x%y));
				break;
			default:
				System.out.println("You Entered an incorrect option");
	}
	sc.close();	

}
}