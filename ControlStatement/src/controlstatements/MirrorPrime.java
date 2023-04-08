package controlstatements;
import java.util.Scanner;
public class MirrorPrime {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n =sc.nextInt();
    	int reverse=0;
        while(n != 0)   
        {  
            int remainder = n % 10;  
            reverse = reverse * 10 + remainder;  
            n = n/10;  
        }  
        int count = 0;
        boolean a = false;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count = count+1;
            }
            if(count==2){
                a= true;
            }
        }
        int count1 = 0;
        boolean b = false;
        for(int j=1;j<=n;j++){
            if(reverse%j==0){
                count1 = count1 + 1;
            }
            if(count1 == 2){
            	 if(reverse%j==0){
                     count1 = count1 + 1;
                 }
                 if(count1 == 2){
                     b = true;
                 }
             }
             if(a==b){
                 System.out.println("yes");
             }
             else{
                 System.out.println("no");
             }
             sc.close();
             }
        }
            }