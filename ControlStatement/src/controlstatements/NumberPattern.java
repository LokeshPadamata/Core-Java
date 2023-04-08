package controlstatements;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
    	int n =s.nextInt();
    	for(int i=1;i<=n;i++) {
    		for(int j=i+1;j<=n;j++) {
    			System.out.println(i+"");
    		}
    		
    	}
    	s.close();
	}

}
