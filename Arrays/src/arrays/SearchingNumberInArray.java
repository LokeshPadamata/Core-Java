package arrays;
import java.util.Scanner;
public class SearchingNumberInArray {

	public static void main(String[] args) {
		int[] arr = {22,55,11,99,66,44,3,0,2};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num) {
				System.out.println("Number is present in the Array");
				break;
				
			}
			else {
				System.out.println("Number is not present");
				
			}
		}
		sc.close();
	}

}

