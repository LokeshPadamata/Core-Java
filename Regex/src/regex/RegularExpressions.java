package regex;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
public class RegularExpressions {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[A-Z][a-z][0-9]");
	    System.out.println(pattern);
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter content");
	    String content = sc.next();
	    System.out.println(content);
	    Matcher match = pattern.matcher(content);
	    match.matches();
	    boolean result = match.matches();
	    System.out.println(result);
		
		System.out.println(Pattern.compile("[A-Z][a-z][0-9]").matcher("AAa1").matches());  //second method		
		boolean res = Pattern.matches("[A-Z][a-z][0-9]", "Aa1");   // third method
		System.out.println(res);
		
		
		sc.close();
	}

}
