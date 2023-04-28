package controlstatements;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a no");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c=c+1;
			}
		}
		if(c==2) {
			System.out.println("Prime");
			
		}
		else {
			System.out.println("Not a Prime Number");
		}
		sc.close();
	}	
}

