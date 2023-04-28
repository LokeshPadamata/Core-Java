package regex;
import java.util.regex.Pattern;
public class RegexQuantifiers {

	public static void main(String[] args) {
		//password should contain min 1 upper,1 lowercase
		// n+ quantifier - at least one n
		boolean result = Pattern.compile("[A-Z]+[a-z]").matcher("AAa").matches();
		System.out.println("result= " + result);
		
		// n* zero or more occurances
		boolean result1 = Pattern.compile("[A-z]*[a-z]").matcher("aaa").matches();
		System.out.println("result1= " +result1);
		
		// n? zero or one occurance
		boolean result3 = Pattern.compile("[A-Z]?[a-z]").matcher("a").matches();
		System.out.println("result3= " +result3);
		
		// X{n} fixing the  no of char sequence --- x{5} should have 5 chars sequence
		boolean result4 = Pattern.compile("[A-Z]{4}[a-z]").matcher("AAAAa").matches();
		System.out.println("result4 = " + result4);
		
		// X{n,m} - fixing the number of char sequence between n and m - X{5,10} - Should have BETWEEN 5 and 10. 
		boolean result5 = Pattern.compile("[A-Z]{2,4}[a-z]").matcher("AAAAa").matches();
		System.out.println("result5 = " + result5);
		
		 // X{n,} - min 5 and maximum can be any
		boolean result6 = Pattern.compile("[A-Z]{2,}[a-z]").matcher("AAAAAAAAAAAAAAa").matches();
		System.out.println("result6 = " + result6);
	}

}
