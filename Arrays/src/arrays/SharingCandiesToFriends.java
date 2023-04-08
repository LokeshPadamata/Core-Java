package arrays;
import java.util.Scanner;
public class SharingCandiesToFriends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=i+1;i<n;j++)
			if((arr[i])%(j+1) == 0) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
			
	}

}
