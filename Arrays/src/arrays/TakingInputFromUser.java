package arrays;
import java.util.Scanner;
public class TakingInputFromUser {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length for array");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			Scanner c = new Scanner(System.in);
			System.out.println("Enter no for array");
			int temp = c.nextInt();
			arr[i]=temp;
		}
		System.out.println("---------------------------");
		System.out.println("The  Array is: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}		
		s.close();		
	}
}
