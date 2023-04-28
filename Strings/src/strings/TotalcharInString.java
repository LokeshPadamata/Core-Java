package strings;
import java.util.Scanner;
public class TotalcharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String l = sc.nextLine();
		int count=0;
		for(int i=0;i<l.length();i++) {
			char searchchar = l.charAt(i);
			for(int j=i+1;j<l.length()-1;j++) {
				if(l.charAt(i)==' ') {
					continue;
				}
				if(searchchar==l.charAt(j)){
					
					count = count+1;
				}
			}
			System.out.println(count);
		}
		sc.close();
}
	}
