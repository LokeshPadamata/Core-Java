package controlstatements;
import java.util.Scanner;
public class SumEqualsProduct {
	    public static void main(String[] args){
	    	Scanner sc = new Scanner(System.in);
	    	int n =sc.nextInt();
	    	int product = 1;
	    	int sum = 0;
	        while (n != 0) {
	            product = product * (n % 10);
	            sum = sum + (n % 10);
	            n = n / 10;
	        }
	        if(sum==product) {
	        	
	        System.out.println("true");
	    }
	        else {
	        	System.out.println("false");
	        }
	        sc.close();
	}   }